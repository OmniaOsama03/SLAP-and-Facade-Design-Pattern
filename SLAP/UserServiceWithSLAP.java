package SLAP;

public class UserServiceWithSLAP
{
    public void registerUser(String name, String email) {
        System.out.println("Registering user...");

        if (!isValid(name, email)) {
            System.out.println("Invalid data");
            return;
        }

        saveUser(name, email);
        sendWelcomeEmail(name, email);
    }

    private boolean isValid(String name, String email) {
        return name != null && email != null;
    }

    private void saveUser(String name, String email) {
        System.out.println("Saving user: " + name + ", " + email);
    }

    private void sendWelcomeEmail(String name, String email) {
        String subject = "Welcome!";
        String body = "Hello " + name + ", welcome to our service!";
        String from = "noreply@company.com";

        System.out.println("Sending email to " + email);
        System.out.println("From: " + from);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
    }
}
