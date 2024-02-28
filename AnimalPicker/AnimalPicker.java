package AnimalPicker;

import java.util.Scanner;

public class AnimalPicker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean validInput = false;

        // Continually ask the user for a valid animal option until they provide one
        do {
            System.out.println("Which animal would you like to see: a dog, a cat, Lion, or a fish,?");
            input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("dog")) {
                validInput = true;
                printDog();
            } else if (input.equals("cat")) {
                validInput = true;
                printCat();
            } else if (input.equals("fish")) {
                validInput = true;
                printFish();
            
            }else if (input.equals("lion")) {
                validInput = true;
                printLion();

            }else {
                System.out.println("Invalid option. Please enter 'dog', 'cat', or 'fish'.");
            }
        } while (!validInput);

        scanner.close();
    }

    private static void printDog() {
        // ASCII art for a dog
        System.out.println("     / \\__");
        System.out.println("    (    @\\___");
        System.out.println("    /         O");
        System.out.println("   /   (_____/");
        System.out.println("  /_____/   U");
    }

    private static void printCat() {
        // ASCII art for a cat
        System.out.println("//\\_\\//");
        System.out.println("// 0 0 \\ ");
        System.out.println("\\ \\~(*)~ /");
        System.out.println(" \\__|__/");
        System.out.println("    | |");
        System.out.println("   /   \\");
        System.out.println("  |     |");
        System.out.println(" /| | | |\\");
        System.out.println(" \\| | |_|/\\");
        System.out.println("  |_ _ _||/");
        System.out.println("  (/,/,/,)");
        System.out.println("  (,,,,,,)");
    }

    private static void printFish() {
        // ASCII art for a fish
        System.out.println("      /\"*._         ");
        System.out.println(" .-*'`    `*-.._.-'/");
        System.out.println("< * ))     ,       ( ");
        System.out.println("  `*-._`._(__.--*'\"`.\\");
    }

    private static void printLion(){
        //ASCII Art for a Lion
        System.out.println("   |\\_                \\|\\||             \n  -\' | `.             -- ||||/       \n /7      `-._        /7   |||||/            \n/            `-.____/    |||||||/`-.____________\n\\-\'_                \\-\' |||||||||               `-._\n -- `-.              -/||||||||\\                `` -`.\n       |\\              /||||||\\             \\_  |   `\\\\\n       | \\  \\_______...-//|||\\|________...---\'\\  \\    \\\\\n       |  \\  \\            ||  |  \\ ``-.__--. | \\  |    ``-.__--.\n       |  |\\  \\          / |  |\\  \\   ``---\'/ / | |       ``---\'\n     _/  / _|  )      __/_/  / _|  )     __/ / _| |\n    /,__/ /,__/      /,_/,__/_/,__/     /,__/ /,__/          tbk");
    }
}