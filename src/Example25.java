import java.util.Scanner;
public class Example25 {
    public static void main(String[] args) {
        int number;
        int table;
        System.out.println("Please type the number that you want to know the Multiplication table:  ");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        number = inputValue.nextInt();
        for (int i = 1; i <= 10; i++) {
            table = number * i;

            System.out.println(number + "*" +  i + "=" +table);
        }
    }
}
