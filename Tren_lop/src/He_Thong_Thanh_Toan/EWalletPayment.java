package He_Thong_Thanh_Toan;

public class EWalletPayment implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Thanh toán " + amount +"  bằng ví điện tử");
		
	}

}
