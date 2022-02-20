import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String a = s.nextLine();
        System.out.println("You've entered " + a + ".");

        System.out.print("Enter an integer: ");
        int b;
        if(s.hasNextInt()){
            b = s.nextInt();
            System.out.println("You've entered " + b + ".");
        }else{
            System.out.println("You didn't enter an integer.");
        }

        s.close();
    }

}
