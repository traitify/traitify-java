package com.traitify;

import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.traitify.models.*;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

import static org.junit.Assert.*;

public class TraitifyTest {

    @BeforeClass
    public static void setUp() {
        Traitify.apiKey = System.getProperty("apiKey");
        Traitify.overrideApiBase(System.getProperty("apiBase"));
    }

    @Test
    public void testDeckList() {
        List<Deck> decks = listDecks();
        assertTrue(decks.size() > 0);
    }

    @Test
    public void testAssessmentCreate() {
        String deck = getDeck();
        Assessment assessment = createAssessment(deck);

        assertNotNull(assessment.getId());
        assertEquals(assessment.getDeck_id(), deck);
    }

    @Test
    public void testAssessmentGet() {
        Assessment assessment = createAssessment();
        Assessment getAssessment = Assessment.get(assessment.getId());

        assertNotNull(getAssessment.getId());
        assertEquals(assessment.getId(), getAssessment.getId());
        assertEquals(assessment.getDeck_id(), getAssessment.getDeck_id());
    }

    @Test
    public void testSlideList() {
        List<Slide> slides = listSlides();

        assertTrue(slides.size() > 0);
    }

    @Test
    public void testSlideBulkUpdate() {
        Assessment assessment = createAssessment();
        List<Slide> slides = listSlides(assessment.getId());

        for(Slide slide:slides){
            slide.setResponse(true);
            slide.setTime_taken(600);
            assertNull(slide.getCompleted_at());
        }

        slides = Slide.bulkUpdate(assessment.getId(), slides);

        assertNotNull(slides);

        for(Slide slide:slides){
            assertNotNull(slide.getCompleted_at());
        }

    }

    @Test
    public void testSlideUpdate() {
        Assessment assessment = createAssessment();
        List<Slide> slides = listSlides(assessment.getId());
        Slide slide = slides.get(0);

        slide.setResponse(true);
        slide.setTime_taken(600);

        slide = Slide.update(assessment.getId(), slide);

        assertEquals(slide.getTime_taken(), new Integer(600));
        assertEquals(slide.getResponse(), true);
        assertNotNull(slide.getCompleted_at());
    }

// TODO Uncomment this test once server side locking is implemented
//    @Test
//    public void testAsyncSlideUpdates() throws ExecutionException, InterruptedException {
//        final Assessment assessment = createAssessment();
//        List<Slide> slides = listSlides(assessment.getId());
//
//        List<ListenableFuture<Slide>> futures = new ArrayList<ListenableFuture<Slide>>();
//        for(final Slide slide : slides){
//            futures.add(MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(20)).submit(new Callable<Slide>() {
//                public Slide call() {
//                    slide.setResponse(true);
//                    slide.setTime_taken(600);
//
//                    return Slide.update(assessment.getId(), slide);
//                }
//            }));
//        }
//
//        Futures.successfulAsList(futures).get();
//
//        Assessment updated_assessment = Assessment.get(assessment.getId());
//
//        assertNotNull(updated_assessment.getCompleted_at());
//    }

    @Test
    public void testPersonalityTypes() {
        Assessment assessment = createAssessment();

        AssessmentPersonalityTypes assessmentPersonalityTypes = listAssessmentPersonalityTypes(assessment.getId());

        assertNotNull(assessmentPersonalityTypes.getPersonality_types());
        assertTrue(assessmentPersonalityTypes.getPersonality_types().size() > 0);
    }

    @Test
    public void testPersonalityTraits() {
        Assessment assessment = createAssessment();

        PersonalityType personalityType = getPersonalityType(assessment.getId());

        List<AssessmentPersonalityTrait> assessmentPersonalityTraits = Assessment.personalityTraits(assessment.getId(), personalityType.getId());

        assertNotNull(assessmentPersonalityTraits);
        assertTrue(assessmentPersonalityTraits.size() > 0);
    }

    @Test
    public void testAllPersonalityTraits() {
        Assessment assessment = createAssessment();
        updateAllSlides(assessment.getId());

        List<AssessmentPersonalityTraitDichotomy> assessmentPersonalityTraits = Assessment.personalityTraits(assessment.getId());

        for(AssessmentPersonalityTraitDichotomy assessmentPersonalityTraitDichotomy : assessmentPersonalityTraits){
            assertNotNull(assessmentPersonalityTraitDichotomy.getLeft_personality_trait());
            assertNotNull(assessmentPersonalityTraitDichotomy.getRight_personality_trait());
        }

        assertNotNull(assessmentPersonalityTraits);
        assertTrue(assessmentPersonalityTraits.size() > 0);
    }

    private List<Deck> listDecks() {
        List<Deck> decks = Deck.list();
        assertNotNull(decks);
        return decks;
    }

    private String getDeck() {
        return "career-deck";
    }

    private Assessment createAssessment(String deck) {
        Assessment assessment = Assessment.create(deck);
        assertNotNull(assessment);
        return assessment;
    }

    private Assessment createAssessment() {
        return createAssessment(getDeck());
    }

    private List<Slide> listSlides(String assessment_id){
        List<Slide> slides = Slide.list(assessment_id);
        assertNotNull(slides);
        return slides;
    }

    private List<Slide> listSlides(){
        return listSlides(createAssessment().getId());
    }

    private List<Slide> updateAllSlides(String assessment_id){
        List<Slide> slides = listSlides(assessment_id);

        Random random = new Random();
        for(Slide slide:slides){
            slide.setResponse(random.nextBoolean());
            slide.setTime_taken(600);
            assertNull(slide.getCompleted_at());
        }

        return Slide.bulkUpdate(assessment_id, slides);
    }

    private List<Slide> updateAllSlides(){
        return updateAllSlides(createAssessment().getId());
    }

    public AssessmentPersonalityTypes listAssessmentPersonalityTypes(String assessment_id){
        updateAllSlides(assessment_id);

        AssessmentPersonalityTypes personalityTypes = Assessment.personalityTypes(assessment_id);

        assertNotNull(personalityTypes);

        return personalityTypes;
    }

    private PersonalityType getPersonalityType(String assessment_id) {
        AssessmentPersonalityTypes assessmentPersonalityTypes = listAssessmentPersonalityTypes(assessment_id);

        assertNotNull(assessmentPersonalityTypes.getPersonality_types());

        AssessmentPersonalityType assessmentPersonalityType = assessmentPersonalityTypes.getPersonality_types().get(0);
        assertNotNull(assessmentPersonalityType);

        assertNotNull(assessmentPersonalityType.getPersonality_type());

        return assessmentPersonalityType.getPersonality_type();
    }

}
