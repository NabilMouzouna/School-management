package classes;
class User {
    // Static variable for auto-incrementing IDs
    static int idCounter = 0;
    
    private String userId = "U"; // Primary Key
    private String name;
    private String email;
    private String password;
    String profilePicture;

    User( String name, String email, String password, String profilePicture){
        idCounter++;
        this.userId += idCounter;
        this.name = name;
        this.email = email;
        this.password = password;
        this.profilePicture = profilePicture;
    }
    public String getUserId() {return userId;}
    public String getName() {return name;}
    public String getEmail() {return email;}
    public String getPassword() {return password;}
    public void setName(String name) {this.name = name;}
    public void setEmail(String email) {this.email = email;}
    public void setProfilePicture(String profilePicture) {this.profilePicture = profilePicture;}
    public void setPassword(String password) {this.password = password;}
    public boolean isValidUser() {
        return name != null && !name.isEmpty() &&  // Name should not be empty
               email != null && email.contains("@") && email.contains(".") &&  // Valid email format
               password != null && password.length() >= 6;  // Password should have at least 6 characters
    }
    public void displayUserInfo() {
        System.out.println("User ID: " + userId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Profile Picture: " + (profilePicture != null ? profilePicture : "No picture"));
    }
}
