import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = UserManager.getInstance();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nCRUD Operations:");
            System.out.println("1. Create Regular User");
            System.out.println("2. Create Admin User");
            System.out.println("3. Read Users");
            System.out.println("4. Update User");
            System.out.println("5. Delete User");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter user name: ");
                    String name = scanner.next();
                    System.out.print("Enter user email: ");
                    String email = scanner.next();
                    System.out.print("Enter user role: ");
                    String role = scanner.next();
                    userManager.createUser(name, email, role);
                    break;
                case 2:
                    System.out.print("Enter admin user name: ");
                    name = scanner.next();
                    System.out.print("Enter admin user email: ");
                    email = scanner.next();
                    System.out.print("Enter admin user level: ");
                    int level = scanner.nextInt();
                    userManager.createAdminUser(name, email, level);
                    break;
                case 3:
                    userManager.readUsers();
                    break;
                case 4:
                    System.out.print("Enter user index: ");
                    int index = scanner.nextInt();
                    System.out.print("Enter new user name: ");
                    name = scanner.next();
                    System.out.print("Enter new user email: ");
                    email = scanner.next();
                    userManager.updateUser(index, name, email);
                    break;
                case 5:
                    System.out.print("Enter user index: ");
                    index = scanner.nextInt();
                    userManager.deleteUser(index);
                    break;
                case 6:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}