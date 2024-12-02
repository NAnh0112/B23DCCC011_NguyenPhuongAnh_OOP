package He_Thong_Thanh_Toan;

public class Main {
	public static void main(String[] args) {
		        // Thanh toán bằng thẻ
		        Payment cardPayment = new CardPayment();
		        Store store = new Store(cardPayment);
		        store.processPayment(150.0);  // Thanh toán 150.0 qua thẻ

		        // Thay đổi phương thức thanh toán sang ví điện tử
		        Payment eWalletPayment = new EWalletPayment();
		        store.processPayment(eWalletPayment);
		        store.processPayment(200.0);  // Thanh toán 200.0 qua ví điện tử

		        // Thay đổi phương thức thanh toán sang tiền mặt
		        Payment cashPayment = new CashPayment();
		        store.processPayment(cashPayment);
		        store.processPayment(50.0);  // Thanh toán 50.0 bằng tiền mặt
		   

	}
}
