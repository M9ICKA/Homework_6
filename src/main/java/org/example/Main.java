package org.example;

import org.example.Creatures.Beast;
import org.example.Creatures.Bird;
import org.example.Creatures.Fish;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Zoo!!! Select who you want to watch (Enter item number) - \n1 Archerfish\n" +
                "2 Fugu\n3 Hedgehog\n4 Elk\n5 Duck\n6 Peacock\n0 Go home");
        int userchoise = scanner.nextInt();

        if (userchoise != 0) {
            do {
                while (userchoise < 0 || userchoise > 6) {
                    System.out.println("You have chosen the wrong item, please select again");
                    userchoise = scanner.nextInt();
                }
                switch (userchoise) {
                    case 1:
                        Fish archerfish = new Fish("Archerfish", "Hunt insects by shooting water at them");
                        System.out.println(archerfish.GetIformationAboutACreature());
                        break;
                    case 2:
                        Fish fugu = new Fish("Fugu", "Inflates when in danger");
                        System.out.println(fugu.GetIformationAboutACreature());
                        break;
                    case 3:
                        Beast hedgehog = new Beast("Hedgehog", "Curls into a ball when in danger");
                        System.out.println(hedgehog.GetIformationAboutACreature());
                        break;
                    case 4:
                        Beast elk = new Beast("Elk", "Sheds its antlers once a year");
                        System.out.println(elk.GetIformationAboutACreature());
                        break;
                    case 5:
                        Bird duck = new Bird("Duck", "Swims and dives well");
                        System.out.println(duck.GetIformationAboutACreature());
                        break;
                    case 6:
                        Bird peacock = new Bird("Peacock", "Male peacocks have a large and beautiful tail.");
                        System.out.println(peacock.GetIformationAboutACreature());
                        break;
                }
                if (userchoise != 0) {
                    System.out.println("Select who you want to watch (Enter item number) - \n1 Archerfish\n" +
                            "2 Fugu\n3 Hedgehog\n4 Elk\n5 Duck\n6 Peacock\n0 Go home");
                    userchoise = scanner.nextInt();
                }
            } while (userchoise != 0);
        userchoise= userchoise -1;
        }
        switch (userchoise) {
            case -1:
                System.out.print("Had a good time at the zoo ");
                break;
            case 0:
                System.out.print("It was in vain that they didn’t look at the animals and went home.");
            break;
        }
        if (userchoise !=0 || userchoise != -1){
            System.out.println("WTF how");
        }

    }
}
