import java.util.Random;

public class ServerNameGenerator {


    public static void main(String[] args) {

//    Create two arrays whose elements are strings,
//    one with at least 10 adjectives,
//    another with at least 10 nouns.

        String[] adj = {
                "bloody",
                "hammered",
                "wicked",
                "placid",
                "jovial",
                "effervescent",
                "tawdry",
                "capricious",
                "pedantic",
                "auspicious",
                "salacious",
                "gaudy"
        };

        String[] nouns = {
                "stage",
                "book",
                "mark",
                "building",
                "hole",
                "way",
                "detail",
                "coach",
                "measure",
                "money",
                "needle",
                "regret"
        };


//    Add a main method,
//    and inside of your main method select a random noun and adjective
//    and hyphenate the combination and display the generated name to the user.

        Random objectToGetRandomNum = new Random();
        int randomNumber = objectToGetRandomNum.nextInt(11);
        System.out.println(adj[randomNumber] + "-" + nouns[randomNumber]);

    }




//    Create a method that will return a random element from an array of strings

//    public static String getRandomString(String[] strings) {
//
//        Random getRandom = new Random();
//         int randomNumber = getRandom.nextInt(strings.length);
//
////         return strings[randomNumber];
//
//    }

}
