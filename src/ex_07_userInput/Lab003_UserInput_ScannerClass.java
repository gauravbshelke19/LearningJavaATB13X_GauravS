package ex_07_userInput;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab003_UserInput_ScannerClass {
    public static void main(String[] args) {

    Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int a= scanner.nextInt();
        System.out.println(a+10);
    }
}
