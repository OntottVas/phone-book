import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBookManager {
    private Map<String, Contact> phoneBook;
    private Scanner scanner;

    public PhoneBookManager() {
        phoneBook = new HashMap<>();
        scanner = new Scanner(System.in);
    }


    public void run() {
        boolean running = true;
        while (running) {
            printMenu(); // TODO valósítsd meg a printMenu() metódust!
            int choice; // TODO olvasd be a felhasználótól, mit szeretne csinálni!
            scanner.nextLine(); // vajon miért kell ez a sor?
            // TODO a megadott szám alapján hívd meg a megfelelő metódust vagy lépj ki!
        }
        scanner.close();
    }

    private void printMenu() {
        // TODO Írd ki az alábbi menüsort:
        //  0. List contacts
        //  1. Add contact
        //  2. Search contact
        //  3. Remove contact
        //  4. Exit
        System.out.println("0. List contacts");
        System.out.println("1. Add contact");
        System.out.println("2. Search contact");
        System.out.println("3. Remove contact");
        System.out.println("4. Exit");
    }

    private void listContacts() {
        // TODO Szépen formázva írd ki a telefonkönyv összes bejegyzését!
    }

    private void addContact() {
        // TODO olvasd be egy változóba a kontakt nevét
        // TODO olvasd be egy változóba a kontakt telefonszámát
        // TODO példányosíts ezekből az adatokból egy Contact-ot
        // TODO tedd bele ezeket az infókat a mapbe:
        //      mi lesz a kulcs és mi az érték?
    }

    private void searchContact() {
        // TODO valósítsd meg a név alapján való keresést
        //  ha nem találod meg az adott kontaktot, jelezd
        //  azt is a felhasználónak!
    }

    private void removeContact() {
        // TODO valósítsd meg a név alapján való törlést
        //  ha nem találod meg az adott kontaktot, jelezd
        //  azt is a felhasználónak!
    }

}
