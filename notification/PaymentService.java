package notification;

public class PaymentService {

    // Simulated method to obtain a token
    public String generateToken(String cardNumber, String expiryDate, String cvv) {
        // In a real-world scenario, this would be a secure call to a tokenization service
        return "generatedToken12345"; // This is a placeholder token
    }

    // Simulated payment processing using a token
    public boolean processPayment(String token, double amount) {
        // Send the token to the payment gateway for processing
        System.out.println("Processing payment with token: " + token + " for amount: $" + amount);

        // Simulate a successful payment response
        return true;
    }

    public static void main(String[] args) {
        PaymentService processor = new PaymentService();

        // Step 1: Generate a token for payment details
        String token = processor.generateToken("4111111111111111", "12/25", "123");

        // Step 2: Process payment with the token
        double amount = 50.0;
        boolean success = processor.processPayment(token, amount);

        // Step 3: Notify the user of payment status
        Notificationservice notificationService = new Notificationservice(new Emailnotification());
        if (success) {
            notificationService.notifyUser("Your payment of $" + amount + " was successful!");
        } else {
            notificationService.notifyUser("Your payment failed. Please try again.");
        }

//        String token = paymentGateway.generateToken("4111111111111111", "12/25", "123");
//
//        boolean paymentStatus = paymentGateway.processPayment(token, 2000); // 2000 cents ($20)
//        if (paymentStatus) {
//            System.out.println("Payment succeeded!");
//        } else {
//            System.out.println("Payment failed!");
//        }

    }
}
