package FacadeDesignPattern;

class HotelBookingFacade {
    private RoomAvailabilityService roomService = new RoomAvailabilityService();
    private PaymentService paymentService = new PaymentService();
    private NotificationService notificationService = new NotificationService();
    private CustomerService customerService = new CustomerService();

    public void bookRoom(String customerId, String roomType, double amount)
    {
        if (roomService.isRoomAvailable(roomType))
        {
            if (paymentService.processPayment(customerId, amount))
            {
                notificationService.sendConfirmation(customerId);
                customerService.updateCustomerHistory(customerId);
                System.out.println("Room booked successfully.");

            } else {
                System.out.println("Payment failed. Booking not completed.");
            }
        } else {
            System.out.println("Room not available.");
        }
    }
}