package SLAP;

public class UserServiceWithoutSLAP
{
    public void registerUser(String name, String email)
    {
        System.out.println("Registering user...");

        //Simulating database operation
        if (name == null || email == null) {
            System.out.println("Invalid data");
            return;
        }
        System.out.println("Saving user: " + name + ", " + email);

        //Preparing an email
        String subject = "Welcome!";
        String body = "Hello " + name + ", welcome to our service!";
        String from = "noreply@company.com";

        //Simulating sending the email
        System.out.println("Sending email to " + email);
        System.out.println("From: " + from);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
    }
}
