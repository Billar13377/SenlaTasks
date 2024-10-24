package first;

import java.util.Random;
import java.util.Scanner;

public class GallowsGame {
    private final int HEAT_POINTS = 5;
    private final String[] WORD_DICTIONARY = {"слово", "животное", "машина", "книга", "ручка"};

    public void startGame(){
        String totalWord = WORD_DICTIONARY[new Random().nextInt(WORD_DICTIONARY.length)];
        Scanner keyboard = new Scanner(System.in);
        StringBuilder quizWord = new StringBuilder("_".repeat(totalWord.length()));
        int remainingHeatPoints = HEAT_POINTS;
        System.out.println("Игра \"Виселица\"");
        do {
            System.out.print("Введите букву: ");
            char keyboardListener = keyboard.nextLine().toLowerCase().charAt(0);

            if(totalWord.indexOf(keyboardListener) >= 0){
                for (int i = 0; i < totalWord.length(); i++){
                    if (totalWord.charAt(i) == keyboardListener) {
                        quizWord.setCharAt(i, keyboardListener);
                    }
                }
                System.out.println("Правильно! Слово сейчас: " + quizWord);
            }
            else {
                remainingHeatPoints--;
                System.out.println("Неправильно! Осталось попыток: " + remainingHeatPoints);
            }
        } while (remainingHeatPoints > 0 && !quizWord.toString().equals(totalWord));

        if (quizWord.toString().equals(totalWord)) {
            System.out.println("Поздравляем! Вы угадали слово: " + totalWord);
        } else {
            System.out.println("Вы проиграли! Загаданное слово было: " + totalWord);
        }
        keyboard.close();
    }
}
