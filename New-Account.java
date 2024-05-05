public class PMUMentor {
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    
    public PMUMentor(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

   
    public void createNewAccount() {
        System.out.println("Creating new account for " + firstName + " " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Account created successfully!");
    }

   
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


public class Main {
    public static void main(String[] args) {
        PMUMentor mentor = new PMUMentor("John", "Doe", "johndoe@example.com", "password123");
        mentor.createNewAccount();
    }
}
