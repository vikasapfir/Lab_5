public class SentenceConverter {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter text:");
            return;
        }
        String inputText = args[0];
        SentenceConverter sentenceConverter = new SentenceConverter();
        sentenceConverter.reverseWords(inputText);
        System.out.println(sentenceConverter.reverseWords(inputText));
    }

    private String reverseWord(String word) {

        StringBuilder str = new StringBuilder();

        str.append(word);

        str.reverse();

        return str.toString();
    }

    public String reverseWords(String text) {

        String newText = "";

        String[] sentences = text.split("(?<=[.?!])\\s*");

        for (String sentence : sentences) {
            if (sentence.endsWith("?")) {
                String[] words = sentence.split(" ");
                if (words.length > 2) {
                    int mid = words.length / 2;
                    if (words.length % 2 == 1) {
                        words[mid] = reverseWord(words[mid]);
                    } else {
                        words[mid] = reverseWord(words[mid]);
                        words[mid - 1] = reverseWord(words[mid - 1]);
                    }
                }
                for (String word : words) {
                    newText += word + " ";
                }
            } else {
                newText += sentence + " ";
            }
        }
        return newText.trim();
    }
}
