import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    private Set<String> set = new HashSet<>();

    public WordsChecker(String text) {
        Collections.addAll(this.set, text.split("\\P{IsAlphabetic}+"));
    }

    public boolean hasWord(String word) {
        return this.set.contains(word);
    }

    public Set<String> getSet() {
        return set;
    }

}
