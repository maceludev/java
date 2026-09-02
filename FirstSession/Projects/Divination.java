package FirstSession.Projects;

import java.util.Scanner;

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

        System.out.print("Enter a word: ");
        String word = sc.next();
        oneLine();

        StringBuilder hiddenWord = new StringBuilder();
        for (int i = 1; i < word.length(); i++) {
            hiddenWord.append("_");
        }
        System.out.println("Word - " + hiddenWord);
        System.out.println();

        while (hiddenWord.indexOf("_") != -1) {
            System.out.print("Enter a character: ");
            String character = sc.next();

            if (word.contains(character)) {
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == character.charAt(0)) {
                        hiddenWord.replace(i, i+1, character);
                    }
                }
            }
            System.out.println("Word - " + hiddenWord);
        }

    }
}
