class checkVowelConsonants{
    public static String check(char ch) {
    ch = Character.toLowerCase(ch);
    if (ch < 'a' || ch > 'z') return "Invalid character";
    return "aeiou".indexOf(ch) != -1 ? "Vowel" : "Consonant";
}
    public static void main(String[] args) {
        System.out.println(check('a'));
        System.out.println(check('s'));
    }
}