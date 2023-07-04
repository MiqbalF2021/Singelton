import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = UserManager.getInstance();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("CRUD Operations:");
            System.out.println("1. Create User");
            System.out.println("2. Read Users");
            System.out.println("3. Update User");
            System.out.println("4. Delete User");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter user name: ");
                    String name = scanner.next();
                    System.out.print("Enter user email: ");
                    String email = scanner.next();
                    userManager.createUser(name, email);
                    break;
                case 2:
                    userManager.readUsers();
                    break;
                case 3:
                    System.out.print("Enter user index: ");
                    int index = scanner.nextInt();
                    System.out.print("Enter new user name: ");
                    name = scanner.next();
                    System.out.print("Enter new user email: ");
                    email = scanner.next();
                    userManager.updateUser(index, name, email);
                    break;
                case 4:
                    System.out.print("Enter user index: ");
                    index = scanner.nextInt();
                    userManager.deleteUser(index);
                    break;
                case 5:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
