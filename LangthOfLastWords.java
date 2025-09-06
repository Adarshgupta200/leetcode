class LengthOfLastWords {
    public LengthOfLastWords() {
        String s = "Hello World";
        String[] words = s.split(" ");
        int lengthOfLastWord = words[words.length - 1].length();
        System.out.println(lengthOfLastWord);
    }

    public static void main(String[] args) {
        LengthOfLastWords obj = new LengthOfLastWords();
    }
}
