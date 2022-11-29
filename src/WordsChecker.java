import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    protected String text;
    protected Set<String> set = new HashSet<>();

    public WordsChecker(String text) {
        this.text = text;
        for (String s : text.split("\\P{IsAlphabetic}+")) {
            set.add(s);
        }
    }

    public boolean hasWord(String word) {
        return text.contains(word);
    }

    public String getText() {
        return text;
    }


}
