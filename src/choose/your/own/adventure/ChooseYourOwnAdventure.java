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
        System.out.println("You wake up in a creepy durty dark room. \nThe last thing you remember is how you passed out last night on Jake's party. \nYou check your phone to call for help but it's not there so you start looking around and exploring the environment. \nEverything you found is a flashlight and a piece of paper with latin writings on it.\n");
        System.out.println("What do you do?\n");
        System.out.println("A: Try to read it out loud ");
        System.out.println("B: Keep exploring ");
        System.out.println("C: Yell for help \n");
        System.out.print("Enter Your Decision: ");
        String d1 = scan.nextLine();
        d1 = d1.toUpperCase();
        System.out.println("");
        if (d1.equals("A")){
            System.out.println("You hear a loud sound and ground shake a bit as if there was a small earthquake happening. \nThe ghost apears from nowhere and tries to attack you.\n");
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
            System.out.println("You get possesed and you twist your neck to death. Try again. ");
        }
        else if (d2.equals("B") && (d1.equals("A") || d1.equals("C"))){
            System.out.println("You get possesed and you twist your neck to death. Tyr again. ");
        }
        else if (d2.equals("C")&& (d1.equals("A") || d1.equals("C"))){
            System.out.println("Your face is so ugly even the ghost got scarred away when it saw you.\n" + "You desided to explore some more ");
            System.out.println("You find a key under the carpet which opens the door to the next room. ");
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
            System.out.println("You see that there's no floor in the next room and can't see the the bottom. You also see the writings on the wall \" The way in in your head\" ");
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
        }
    }
    
}
