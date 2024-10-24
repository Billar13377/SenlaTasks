package second;

import java.util.Scanner;

public class ExchangeRate {
    private final double RUB_TO_USD = 0.01;
    private final double RUB_TO_AMD = 4.02;
    private final double RUB_TO_KZT = 5.05;
    private final double RUB_TO_TRY = 0.35;
    private final double RUB_TO_JPY = 1.56;

    public void exchangeRub() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("\"Курс валют\"");
        System.out.print("Введите сумму в рублях: ");

        double rubles = keyboard.nextDouble();

        System.out.printf("Сумма в долларах (USD): %.2f%n", rubles * RUB_TO_USD);
        System.out.printf("Сумма в армянских драмах (AMD): %.2f%n", rubles * RUB_TO_AMD);
        System.out.printf("Сумма в казахстанских тенге (KZT): %.2f%n", rubles * RUB_TO_KZT);
        System.out.printf("Сумма в турецких лирах (TRY): %.2f%n", rubles * RUB_TO_TRY);
        System.out.printf("Сумма в японских иенах (JPY): %.2f%n", rubles * RUB_TO_JPY);


    }
}
