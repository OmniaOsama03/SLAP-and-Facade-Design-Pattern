package FacadeDesignPattern;

class NotificationService {
    public void sendConfirmation(String customerId) {
        System.out.println("Sending booking confirmation to customer: " + customerId);
    }
}