public class LinearSearchWord {
    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }
    public static void main(String[] args) {
        String[] sentences = {
            "Hi I am Prince.",
            "I am an Engineer.",
        };
        String word = "love";
        String result = findSentenceWithWord(sentences, word);
        System.out.println("Sentence containing '" + word + "': " + result);
    }
}
