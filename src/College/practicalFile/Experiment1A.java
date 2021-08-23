package College.practicalFile;

public class Experiment1A {
    public static void main(String[] args) {
        System.out.println("------------------");
        System.out.println("Tanay | 1955991593");
        System.out.println("------------------");

        int vowel = 0, consonant = 0;

        for (String arg : args) {
            if (Character.isDigit(arg.charAt(0))) {
                System.out.println("Numbers are not allowed and names should consist of only characters!");
            } else if (
                    arg.charAt(0) == 'A' || arg.charAt(0) == 'a' ||
                            arg.charAt(0) == 'E' || arg.charAt(0) == 'e' ||
                            arg.charAt(0) == 'I' || arg.charAt(0) == 'i' ||
                            arg.charAt(0) == 'O' || arg.charAt(0) == 'o' ||
                            arg.charAt(0) == 'U' || arg.charAt(0) == 'u') {
                vowel += 1;
            } else {
                consonant += 1;
            }
        }

        System.out.println("Number of names starting with consonants are: " + consonant);
        System.out.println("Number of names starting with vowels are: " + vowel);
        System.out.println();
    }
}