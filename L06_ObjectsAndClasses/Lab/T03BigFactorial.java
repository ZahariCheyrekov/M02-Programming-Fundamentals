package M02_ProgrammingFundamentals.L06_ObjectsAndClasses.Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class T03BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        BigInteger bigInteger = new BigInteger("1");
        for (int i = 1; i <= number; i++) {
            bigInteger = bigInteger.multiply(new BigInteger("" + i));
        }
        System.out.println(bigInteger);
    }
}