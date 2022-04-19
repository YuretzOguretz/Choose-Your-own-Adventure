/*
 * Yura Nguyen
 * Escape haunted house
 * April 13, 2022
 */
package choose.your.own.adventure;
import java.util.Scanner;
/**
 *
 * @author yungu3633
 */
public class ChooseYourOwnAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("You wake up in a creepy dirty dark room. The last thing you remember is how you passed out last night at Jake's party. You check your phone to call for help but it's not there so you start looking around and exploring the environment. Everything you found is a flashlight and a piece of paper with Latin writings on it.\n");
        System.out.println("What do you do?\n");
        System.out.println("A: Try to read it out loud ");
        System.out.println("B: Keep exploring ");
        System.out.println("C: Yell for help \n");
        System.out.print("Enter Your Decision: ");
        String d1 = scan.nextLine();
        d1 = d1.toUpperCase();
        System.out.println("");
        if (d1.equals("A")){
            System.out.println("You hear a loud sound and the ground shake a bit as if there was a small earthquake was happening. The ghost appears from nowhere and tries to attack you.\n");
        }
        else if (d1.equals("B")){
            System.out.println("You find a key under the carpet which opens the door to the next room. \n");
        }
        else if (d1.equals("C")) {
            System.out.println("You hear a loud sound and ground shake a bit as if there was a small earthquake happening. \nThe ghost apears from nowhere and tries to attack you.\n");
        }
        
        System.out.println("\nWhat do you do?\n");
        
        if (d1.equals("A") || d1.equals("C")){
            System.out.println("A: Try to fight ");
            System.out.println("B: Read the praier ");
            System.out.println("C: Use flashlight to make a scary face\n");
            System.out.print("Enter Your Decision: ");
        }
        else if(d1.equals("B")){
            System.out.println("You find a key under the carpet which opens the door to the next room. \n");
            System.out.println("D: Walk in ");
            System.out.println("E: Yell \"is anybody there\"");
            System.out.println("F: Dirrect a flashlight in the next room ");
            System.out.print("Enter Your Decision: ");
        }
        String d2 = scan.nextLine();
        d2 = d2.toUpperCase();
        if (d2.equals("A") && (d1.equals("A") || d1.equals("C"))){
            System.out.println("You get possesed and you twist your neck to death.");
        }
        else if (d2.equals("B") && (d1.equals("A") || d1.equals("C"))){
            System.out.println("You get possesed and you twist your neck to death.");
        }
        else if (d2.equals("C")&& (d1.equals("A") || d1.equals("C"))){
            System.out.println("Your face is so ugly even the ghost got scarred away when it saw you. You decided to explore some more");
            System.out.println("You find a key under the carpet which opens the door to the next room. \n");
            System.out.println("D: Walk in ");
            System.out.println("E: Yell \"is anybody there\"");
            System.out.println("F: Dirrect a flashlight in the next room ");
            System.out.print("Enter Your Decision: ");
            d2 = scan.nextLine();
            d2 = d2.toUpperCase();
            if (d2.equals("D") && d1.equals("B")){
            System.out.println("It appears that there was no floor in that room. You fall and die ");
        }
        else if (d2.equals("E") && d1.equals("B")){
            System.out.println("There was no response ");
        }
        else if (d2.equals("F") && d1.equals("B")){
            System.out.println("You see that there's no floor in the next room and can't see the bottom. You also see the writings on the wall \" The way is in your head\" ");
        }
       }
        else if (d2.equals("D") && d1.equals("B")){
            System.out.println("It appears that there was no floor in that room. You fall and die ");
        }
        else if (d2.equals("E") && d1.equals("B")){
            System.out.println("There was no response ");
        }
        else if (d2.equals("F") && d1.equals("B")){
            System.out.println("You see that there's no floor in the next room and can't see the the bottom. You also see the writings on the wall \" The way in in your head\" ");
        }
        
        if (d2.equals("E")){
            System.out.println("There was no response ");
            System.out.println("\nWhat do you do?\n");
            System.out.println("A: Walk in");
            System.out.println("B: Dirrect a flashlight in the next room.");
            System.out.print("Enter Your Decision: ");
            String d3 = scan.nextLine();
            d3 = d3.toUpperCase();
            if (d3.equals("A")){
                System.out.println("It appears that there was no floor in that room. You fall and die.");
            }
            else if (d3.equals("B")){
                System.out.println("You see that there's no floor in the next room and can't see the the bottom. You also see the writings on the wall \" The way is in your head\" ");
            }
        }
        
        System.out.println("What do you do?\n");
        System.out.println("A: Close your eyes and walk in the room ");
        System.out.println("B: Try to  parkure over ");
        System.out.println("C: Explore the room more ");
        System.out.print("Enter Your Decision: ");
        String d4 = scan.nextLine();
        d4 = d4.toUpperCase();
        
        if (d4.equals("A")){
            System.out.println("You fall and die.");
        }
        else if (d4.equals("B")){
            System.out.println("You fall and die.");
        }
        else if (d4.equals("C")){
            System.out.println("You find an exit right behind the covers. You win yey!");
        }
    }
    
}
