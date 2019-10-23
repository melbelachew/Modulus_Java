import java.util.Scanner;

public class Modules_Java {

    public static void main(String [] args){
        Scanner key = new Scanner(System.in);

        System.out.println("Enter a number");

        int userInput = key.nextInt();
        for(int i = 1; i<=userInput; i++){

                System.out.println(i + " " + ((i % 2 == 0)? "even" : "odd"));

        }

    }
}
