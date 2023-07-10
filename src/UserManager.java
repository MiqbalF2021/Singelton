import java.util.ArrayList;
import java.util.List;

class UserManager {
    private static UserManager instance;
    private List<User> userList;

    private UserManager() {
        userList = new ArrayList<>();
    }

    public static synchronized UserManager getInstance() {
        if (instance == null) {
            instance = new UserManager();
        }
        return instance;
    }

    public void createUser(String name, String email, String role) {
        User user = new RegularUser(name, email, role);
        userList.add(user);
        System.out.println("Regular User created successfully.");
    }

    public void createAdminUser(String name, String email, int level) {
        User user = new AdminUser(name, email, level);
        userList.add(user);
        System.out.println("Admin User created successfully.");
    }

    public void readUsers() {
        for (User user : userList) {
            user.displayInfo();
        }
    }

    public void updateUser(int index, String name, String email) {
        if (index >= 0 && index < userList.size()) {
            User user = userList.get(index);
            user = new RegularUser(name, email, "Regular User");
            userList.set(index, user);
            System.out.println("User updated successfully.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void deleteUser(int index) {
        if (index >= 0 && index < userList.size()) {
            userList.remove(index);
            System.out.println("User deleted successfully.");
        } else {
            System.out.println("Invalid index.");
        }
    }
}
