traitify-java
=============

Traitify API client written in Java.
=======
# Traitify Java Client

You can sign up for a Traitify account at https://developers.traitify.com.

Requirements
============

Java 1.5 and later.

Installation
============

### Maven users

Add this dependency to your project's POM:

    <dependency>
      <groupId>com.traitify</groupId>
      <artifactId>traitify-java</artifactId>
      <version>0.0.4</version>
    </dependency>

### Others

You'll need to manually install the following JARs:

* The Traitify JAR from https://code.traitify.com/traitify-java-latest.jar
* [Jersey Client](https://jersey.java.net/nonav/documentation/1.17/chapter_deps.html#core_client) from <http://maven.java.net/service/local/artifact/maven/redirect?r=releases&g=com.sun.jersey&a=jersey-client&v=1.17&e=jar>.
* [Jersey Core](https://jersey.java.net/download.html) from <http://maven.java.net/service/local/artifact/maven/redirect?r=releases&g=com.sun.jersey&a=jersey-core&v=1.17&e=jar>.

Usage
=====

TraitifyExample.java

    import com.traitify.Traitify;
    import com.traitify.model.Assessment;
    import com.traitify.model.Deck;

    public class TraitifyExample {
        public static void main(String[] args) {
            Traitify.apiKey = "YOUR-SECRET-KEY";
            List<Deck> decks = Deck.list();
            Deck deck;
            for(Deck _deck:decks){
                if(_deck.getName().equals("General Personality"){
                    deck = _deck;
                }
            }
            Assessment assessment = Assessment.create(deck.getId());
        }
    }

See [TraitifyTest.java](https://github.com/woofound/traitify-java/blob/master/src/test/java/com/traitify/TraitifyTest.java) for more examples.

Testing
=======

You must have Maven installed. To run the tests, simply run `mvn test`. You can run particular tests by passing `-D test=Class#method` -- for example, `-D test=TraitifyTest#testAssessmentCreate`. You must also specify your `apiKey` when testing, you can do that by passing `-DapiKey=yourapikey`.
