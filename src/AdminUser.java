class AdminUser extends User {
    private int level;

    public AdminUser(String name, String email, int level) {
        super(name, email);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public void displayInfo() {
        System.out.println("Admin User - Name: " + getName() + ", Email: " + getEmail() + ", Level: " + getLevel());
    }
}