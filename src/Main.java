import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner consoleScanner = new Scanner(System.in);

        System.out.print("Valassz menupontot: ");
        int menuPont = consoleScanner.nextInt();

        switch(menuPont) {
            case 1:
                Tv.Controller.main();
                break;
            case 2:
                break;
        }
    }
}
