public class CTest {

    public static void main(String[] args) {
        String[] result = getBigWords("There are 87,000,000 People in Canada");
        for (String word : result) {
            System.out.println(word);
        }
    }

    public static String[] getBigWords(String text) {
        String[] words = text.split("\\s+");
        java.util.ArrayList<String> bigWords = new java.util.ArrayList<>();

        for (String word : words) {
            if (word.length() > 5 && word.matches("[a-zA-Z]+")) {
                bigWords.add(word);
            }
        }

        return bigWords.toArray(new String[0]);
    }
}
