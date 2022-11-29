import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {

        System.out.println("Текст:");

        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et" +
                " dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex" +
                " ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat" +
                " nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim" +
                " id est laborum.";
        System.out.println(text);
        WordsChecker wordsChecker = new WordsChecker(text);

        //System.out.println(wordsChecker.set);

        System.out.println(wordsChecker.hasWord("ipsummm"));
        System.out.println(wordsChecker.hasWord("Duis"));
        System.out.println(wordsChecker.hasWord("Lorem"));


    }

}
