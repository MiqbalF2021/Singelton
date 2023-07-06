class RegularUser extends User {
    private String role;

    public RegularUser(String name, String email, String role) {
        super(name, email);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    @Override
    public void displayInfo() {
        System.out.println("Regular User - Name: " + getName() + ", Email: " + getEmail() + ", Role: " + getRole());
    }
}