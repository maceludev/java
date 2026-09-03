package FirstSession.Projects;

import java.util.*;

public class Divination {
    static void oneLine() {
        System.out.println("---------------------------------------");
    }

    static void printTittle() {
        oneLine();
        System.out.println("Divination Game");
        oneLine();
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        printTittle();

        ArrayList<String> words = new ArrayList<>(List.of("Monkey", "Dog", "Cat", "House", "Bat"));

        Random random = new Random();
        int wordIndex = random.nextInt(0, words.size());

        String word = words.get(wordIndex).toLowerCase();

        ArrayList<Character> letters = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            letters.add(word.charAt(i));
        }

        ArrayList<Character> hiddenWord = new ArrayList<>();
        for (int i = 1; i < word.length() + 1; i++) {
            hiddenWord.add('_');
        }
        System.out.println("Word - " + hiddenWord);
        oneLine();


        while (hiddenWord.contains('_')) {
            System.out.print("Enter a character: ");
            String character = sc.next().toLowerCase();

            if (word.contains(character)) {
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == character.charAt(0)) {
                        hiddenWord.set(i, word.charAt(i));
                    }
                }
            }
            System.out.println("Word - " + hiddenWord);
        }

    }
}
