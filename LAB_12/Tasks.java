package LAB_12;

public class Tasks {
    public String reverseWord(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return reversed;
    }

    public boolean searchWord(String sentence, String searchWord) {
        if (sentence.contains(searchWord)) {
            return true;
        }

        return false;
    }

    public String replaceWord(String sentence, String target, String word) {
        return sentence.replace(target, word);
    }

    public Boolean isPalindrom(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }

    public boolean equalsWords(String wordOne, String wordTwo) {
        if (wordOne.equals(wordTwo)) {
            return true;
        }

        return false;
    }

    public String[] splitString(String sentence, String regex) {
        return sentence.split(regex);
    }

    public void countVowelsAndConsonants(String text) {
        int vowels = 0;
        int consonants = 0;

        text = text.toLowerCase();

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Гласные: " + vowels);
        System.out.println("Согласные: " + consonants);
    }

    public String removeSpaces(String text) {
        return text.replace(" ", "");
    }

    public String longestWord(String text) {
        String[] words = text.split(" ");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }

    public int countCharsWithoutSpaces(String text) {
        return text.replace(" ", "").length();
    }

    public boolean startsWithWord(String text, String word) {
        return text.startsWith(word);
    }

    public boolean endsWithChar(String text, String symbol) {
        return text.endsWith(symbol);
    }

    public String reverseString(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    public String removeDigits(String text) {
        return text.replaceAll("\\d", "");
    }

    public String replaceVowels(String text) {
        return text.replaceAll("[aeiouAEIOU]", "*");
    }

    public void charFrequency(String text) {
        for (char c : text.toCharArray()) {
            int count = 0;
            for (char x : text.toCharArray()) {
                if (c == x) {
                    count++;
                }
            }
            System.out.println(c + ": " + count);
        }
    }

    public boolean isOnlyDigits(String text) {
        return text.matches("\\d+");
    }

    public void execute() {
        String word = "madam";
        String sentence = "hello world java programming 123";

        printHeader("TASK_4 - reverseWord");
        System.out.println(reverseWord(word));

        printHeader("TASK_5 - searchWord");
        System.out.println(searchWord(sentence, "world"));

        printHeader("TASK_6 - replaceWord");
        System.out.println(replaceWord(sentence, "world", "Java"));

        printHeader("TASK_7 - isPalindrom");
        System.out.println(isPalindrom(word));

        printHeader("TASK_8 - equalsWords");
        System.out.println(equalsWords("test", "test"));

        printHeader("TASK_9 - splitString");
        String[] words = splitString(sentence, " ");
        for (String w : words) {
            System.out.println(w);
        }

        printHeader("TASK_10 - countVowelsAndConsonants");
        countVowelsAndConsonants(sentence);

        printHeader("TASK_11 - removeSpaces");
        System.out.println(removeSpaces(sentence));

        printHeader("TASK_12 - longestWord");
        System.out.println(longestWord(sentence));

        printHeader("TASK_13 - countCharsWithoutSpaces");
        System.out.println(countCharsWithoutSpaces(sentence));

        printHeader("TASK_14 - startsWithWord");
        System.out.println(startsWithWord(sentence, "hello"));

        printHeader("TASK_15 - endsWithChar");
        System.out.println(endsWithChar(sentence, "3"));

        printHeader("TASK_16 - reverseString");
        System.out.println(reverseString(sentence));

        printHeader("TASK_17 - removeDigits");
        System.out.println(removeDigits(sentence));

        printHeader("TASK_18 - replaceVowels");
        System.out.println(replaceVowels(sentence));

        printHeader("TASK_19 - charFrequency");
        charFrequency("aba");

        printHeader("TASK_20 - isOnlyDigits");
        System.out.println(isOnlyDigits("12345"));
    }

    public static void printHeader(String title) {
        System.out.println("/////////////////////////////////////////");
        System.out.println(title);
        System.out.println("/////////////////////////////////////////");
        System.out.println();
    }
}