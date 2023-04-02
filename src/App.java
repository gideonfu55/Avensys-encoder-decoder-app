import java.util.Scanner;

import coders.Decoder;
import coders.Encoder;

public class App {
    public static void main(String[] args) throws Exception {

        Encoder encoder = new Encoder();
        Decoder decoder = new Decoder();

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            showMenu();

            while (!scanner.hasNextInt()) {
                System.out.println("\nEnter a number.");
                scanner.next();
            }

            option = scanner.nextInt();

            switch (option) {
                case 1: 
                    encodeText(scanner, encoder);
                    break;
                case 2:
                    decodeEncodedText(scanner, decoder);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("\nPlease enter 1 & 2 only.\n");
                    break;
            }
        } while (option >= 0);
        
    }

    public static void showMenu() {
        System.out.println("|----------------------------|");
        System.out.println("| Encoder and Decoder App    |");
        System.out.println("|----------------------------|");
        System.out.println("| Please select your option: |");
        System.out.println("| ·1 Encode a text           |");
        System.out.println("| ·2 Decode an encoded text  |");
        System.out.println("| ·3 Exit Menu               |");
    }

    public static void encodeText(Scanner input, Encoder encoder)  {
        System.out.println("\nEnter a new text:");
        input.nextLine();
        String plainText = input.nextLine();

        String encodedString = encoder.encode(plainText);
        System.out.println("\nEncoded text from \"" + plainText + "\": \n" + encodedString + "\n");
    }

    public static void decodeEncodedText(Scanner input, Decoder decoder) {
        System.out.println("\nEnter an encoded text:");
        input.nextLine();
        String encodedText = input.nextLine();

        String decodedString = decoder.decode(encodedText);
        System.out.println("\nDecoded text from \"" + encodedText + "\": \n" + decodedString + "\n");
    }
}
