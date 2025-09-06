import java.util.Scanner;
public class Additionquize {
    public static void main(String[]args){
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 10 %10);
        System.out.println("Number1  = "+ number1+" " + " number2 = "+  number2 + "\n");

        Scanner in = new Scanner(System.in);

        System.out.println("What is the sum of number 1 and number 2");
        int answer = in.nextInt();
        System.out.println( number1 + number2 + " =" + " " + answer + " Is " + (number1 + number2 == answer));   

    }
}
