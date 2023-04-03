package main;
import java.util.Scanner;

import main.coders.Decoder;
import main.coders.Encoder;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int option;

        System.out.println("\nWelcome! Please choose only from this list of characters to form your text for encoding or decoding with this app:");
        System.out.println("ABCDEFGHIJKLMNOPQRSTUVWYXZ0123456789()*+,-./\n");

        do {
            showMenu();

            while (!scanner.hasNextInt()) {
                System.out.println("\nEnter a number.");
                scanner.next();
            }

            option = scanner.nextInt();

            switch (option) {
                case 1: 
                    encodeText(scanner, new Encoder());
                    break;
                case 2:
                    decodeEncodedText(scanner, new Decoder());
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("\nPlease enter 1 - 3 only.\n");
                    break;
            }
        } while (option >= 0);
        
    }

    /**
     * Function name: showMenu()
     * 
     * In function:
     * 1. Print the option headers for the menu 
     *      
     */
    public static void showMenu() {
        System.out.println("|----------------------------|");
        System.out.println("| Encoder and Decoder App    |");
        System.out.println("|----------------------------|");
        System.out.println("| Please select your option: |");
        System.out.println("| ·1 Encode a text           |");
        System.out.println("| ·2 Decode an encoded text  |");
        System.out.println("| ·3 Exit Menu               |");
        System.out.println("|____________________________|");
    }

    /**
     * Function name: encodeText
     * 
     * @param input
     * @param encoder
     * 
     * In function:
     * 1. Prompt for input and scans input for a new text.
     * 2. Use encoder's encode method to convert the text to encoded string.
     * 
     */
    public static void encodeText(Scanner input, Encoder encoder)  {
        System.out.println("\nEnter a new text:");
        input.nextLine();
        String plainText = input.nextLine();

        String encodedString = encoder.encode(plainText);
        System.out.println("\nEncoded text from \"" + plainText + "\": \n" + encodedString + "\n");
    }

    /**
     * Function name: decodeEncodedText
     * 
     * @param input
     * @param decoder
     * 
     *  In function:
     * 1. Prompt for input and scans input for an encoded text.
     * 2. Use decoder's decode method to convert the encoded string to the decoded text.
     * 
     */
    public static void decodeEncodedText(Scanner input, Decoder decoder) {
        System.out.println("\nEnter an encoded text:");
        input.nextLine();
        String encodedText = input.nextLine();

        String decodedString = decoder.decode(encodedText);
        System.out.println("\nDecoded text from \"" + encodedText + "\": \n" + decodedString + "\n");
    }
}
