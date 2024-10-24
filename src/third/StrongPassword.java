package third;
import java.util.Random;
import java.util.Scanner;

public class StrongPassword {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Введите длину пароля (от 8 до 12 символов):");
        int passwordLength = keyboard.nextInt();

        if (passwordLength < 8 || passwordLength > 12) {
            System.out.println("Длина пароля должна быть от 8 до 12 символов.");
        } else {
            String password = generatePassword(passwordLength);
            System.out.println("Сгенерированный пароль: " + password);
        }
        keyboard.close();
    }
    public static String generatePassword(int length)
    {
        Random random = new Random();
        String upperWords = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerWords = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_=+-/.?<>)";
        String chars = lowerWords + upperWords + numbers + symbols;

        StringBuilder password = new StringBuilder(length);

        for (int i = 0; i < length; i++){
            password.append(chars.charAt(random.nextInt(chars.length())));
        }
        return password.toString();
    }
}
