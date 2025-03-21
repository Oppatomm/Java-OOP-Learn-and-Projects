
enum PaymentStatus {
    PENDING ,
    COMPLETED ,
    FAILED ,
    REFUNDED
}

class Payment {
    private int paymentId;
    private int amount;
    private PaymentStatus  status;

    Payment (int paymentId , int amount , PaymentStatus status) {
        this.paymentId = paymentId;
        if (amount < 0) {
            throw new IllegalArgumentException("The amount cannot be negative.");
        }
        this.amount = amount;
        this.status = status;
    }

    public void processPayment() {
        if (this.status == PaymentStatus.PENDING) {
            this.status = PaymentStatus.COMPLETED;
            System.out.println("Status now : " + status);
        }else if (this.status == PaymentStatus.FAILED) {
            System.out.println("Unable to complete transaction due to payment failure " + "\n" +
                                "Please try making the payment again.");

        }else if (this.status == PaymentStatus.REFUNDED) {
            System.out.println("This payment has already been refunded.");
        }
        else {
            System.out.println("This payment has already been processed.");
        }
    }

    public void refundPayment() {
        if (this.status == PaymentStatus.COMPLETED) {
            System.out.println("You received a refund of " + amount);
            this.amount =  0;
            this.status = PaymentStatus.REFUNDED;
        }else if (this.status == PaymentStatus.FAILED) {
            System.out.println("Refunds are not available due to status : " + PaymentStatus.FAILED);
        }else if (this.status == PaymentStatus.REFUNDED) {
            System.out.println("This payment has already been refunded.");
        }
    }

    public void showPaymentInfo() {
        System.out.println  ("PaymentId : " + paymentId + "\n"
                            + "Amount : " + amount + "\n"
                            + "Status : " + status);
    }
}

public class Payment_Management_System_Using_Enum {
    public static void main(String[] args) {
        try {
            Payment payment = new Payment(11528, 5000, PaymentStatus.PENDING);

            payment.showPaymentInfo();
    
            payment.refundPayment();
    
            System.out.println("------------------------");
    
            payment.processPayment();
    
            System.out.println("------------------------");
    
            payment.processPayment();
    
            System.out.println("------------------------");
    
            payment.refundPayment();
    
            System.out.println("------------------------");
    
            payment.showPaymentInfo();
    
            System.out.println("------------------------");
    
            payment.refundPayment();
        } catch (IllegalArgumentException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
