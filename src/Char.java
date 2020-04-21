import java.util.Scanner;

public class Char {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a name");
        String name = keyboard.nextLine();
        System.out.println("Please enter a number");
        int num = keyboard.nextInt();
        int size = name.length();
        System.out.println("The length of alphabet is: " + size);
        System.out.println("The substring from 0 to " + name.substring(0,num));
        if (num > size){
            System.out.println("Index is larger than length");
        }
    }
}
