//created by iilke

import java.util.ArrayList;
import java.util.Scanner;

//I recommend you to run this code first to see the output
//Then try to write to code by yourself and take some hints from the code if you struggle
//Finally, compare your code to this code to see if there is a different solution than yours
//It's okay if you struggle a lot. Don't worry. Practice makes perfect :)

public class ArrayListExerciseForBeginners {
    public static void main(String[] args) {
        ArrayList<Integer> userList = new ArrayList<>();

        boolean isWorking = true;

        System.out.println("An empty array list is set for you. You can do adjustments on it. Here are your options:\n");

        while(isWorking){

            System.out.println("1.Add");
            System.out.println("2.Remove");
            System.out.println("3.Display");
            System.out.println("4.Exit");

            System.out.println();
            System.out.print("Your Choice:");

            Scanner input = new Scanner(System.in);

            String choice = input.nextLine();



            switch (choice){
                case "1"://add to list
                    System.out.print("Enter an integer to add: ");
                    int element = input.nextInt();
                    userList.add(element);
                    System.out.println("Added.\n");
                    break;

                case "2"://remove from list
                    System.out.print("Enter integer to remove: ");
                    int removal = input.nextInt();
                    if(userList.contains(removal)){
                        userList.remove(Integer.valueOf(removal));
                        System.out.println("Removed. \n");
                    }
                    else
                        System.out.println("Not Found.\n");
                    break;

                case "3"://display the list
                    System.out.print("[");
                    for(int i : userList)
                        System.out.print(i + " ");
                    System.out.print("]");
                    System.out.println("\n");
                    break;

                case "4": //exit program
                    isWorking=false;
                    break;

                default:
                    System.out.println("Wrong input. Try again.\n");
            };

        }
    }
}
