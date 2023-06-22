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
            int choice = scanner.nextInt(); // TODO olvasd be a felhasználótól, mit szeretne csinálni!
            scanner.nextLine(); // vajon miért kell ez a sor?
            // TODO a megadott szám alapján hívd meg a megfelelő metódust vagy lépj ki!
            switch (choice){
                case 0 -> listContacts();
                case 1 -> addContact();
                case 2 -> searchContact();
                case 3 -> removeContact();
                case 4 -> {return;}
            }
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
        for (Map.Entry<String, Contact> entry : phoneBook.entrySet()) {
            System.out.println(entry.getValue());
        }

    }

    private void addContact() {
        // TODO olvasd be egy változóba a kontakt nevét
        System.out.println("Name?");
        String name = scanner.nextLine();
        // TODO olvasd be egy változóba a kontakt telefonszámát
        System.out.println("Phonenumber?");
        String phoneNumber = scanner.nextLine();
        // TODO példányosíts ezekből az adatokból egy Contact-ot
        Contact contact = new Contact(name, phoneNumber);
        // TODO tedd bele ezeket az infókat a mapbe:
        //      mi lesz a kulcs és mi az érték?
        this.phoneBook.put(name, contact);
    }

    private void searchContact() {
        // TODO valósítsd meg a név alapján való keresést
        //  ha nem találod meg az adott kontaktot, jelezd
        //  azt is a felhasználónak!
        System.out.println("Who are you looking for?");
        String name = scanner.nextLine();
        if(phoneBook.containsKey(name)) {
            System.out.println(phoneBook.get(name));
        } else {
            System.out.println("Sorry, it seems you do not have contact info.");
        }
    }

    private void removeContact() {
        // TODO valósítsd meg a név alapján való törlést
        //  ha nem találod meg az adott kontaktot, jelezd
        //  azt is a felhasználónak!
    }

}
