package He_Thong_Thanh_Toan;

public class Store {
	private Payment payment;

    // Constructor Injection: Inject Payment vào thông qua constructor
    public Store(Payment payment) {
        this.payment = payment;
    }

    public void processPayment(Payment eWalletPayment) {
        payment.pay(eWalletPayment); // Gọi phương thức pay() của đối tượng Payment
    }
}
