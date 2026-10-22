package semester1.practice06;

public class Task_23 {
    public static void main(String[] args) {
        TextFormatter formatter = new TextFormatter();

        String text = "Привіт";

        System.out.println(formatter.formatTitle(text));
        System.out.println("Кількість голосних: "
                + formatter.countVowels(text));
    }
}

class TextFormatter {
    public String formatTitle(String text) {
        return "* " + text.toUpperCase() + " *";
    }

    public int countVowels(String text) {
        int count = 0;
        String vowels = "аоуеиіяюєїaeiou";

        for (int i = 0; i < text.length(); i++) {
            char letter = Character.toLowerCase(text.charAt(i));

            if (vowels.indexOf(letter) != -1) {
                count++;
            }
        }

        return count;
    }
}