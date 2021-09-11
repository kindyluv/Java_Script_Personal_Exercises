package ChapterEleven;

import java.util.Objects;
import java.util.Scanner;

public class RollerCoaster {
  //  private int age = 0;
  //  private int cost = 0;
    private static Scanner scanner = new Scanner(System.in);
   // private static int height = scanner.nextInt();
    //private static String photos = scanner.next();

    public static void rollerCoaster(){
        System.out.println("Enter height:  ");
        int height = scanner.nextInt();
        int cost;
        if (height > 120) {
            System.out.println("welcome to semicolon roller coaster");
            System.out.println("Enter age:  ");
            int age = scanner.nextInt();
            if (age >= 18) {
                cost = 12;
                System.out.println("adult ride would cost you " + cost);
            } else {
                if (age >= 12) {
                    cost = 7;
                    System.out.println("teenage ride would cost you " + cost);
                } else {
                    cost = 5;
                    System.out.println("child ride would cost you " + cost);
                }
            }
            System.out.println("Enter yes or no if you want to take picture");
            String photos = scanner.next();
            if (Objects.equals(photos, "Yes")){
                cost += 3;
                System.out.println("your bill is additional " + cost);
            }else {
                System.out.println("your bill is " + cost);
            }
        }
        else{
            System.out.println("sorry you are not qualified to ride the roller coaster");
        }

    }

    public static void main(String[] args) {
        rollerCoaster();
    }
}
