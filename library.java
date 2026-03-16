import java.util.*;

public class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> books = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n1.Add Book  2.View Books  3.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    System.out.print("Enter book name: ");
                    String book = sc.nextLine();
                    books.add(book);
                    System.out.println("Book added!");
                    break;

                case 2:
                    System.out.println("Books in Library:");
                    for(String b : books) {
                        System.out.println(b);
                    }
                    break;
            }
        } while(choice != 3);
    }
}
