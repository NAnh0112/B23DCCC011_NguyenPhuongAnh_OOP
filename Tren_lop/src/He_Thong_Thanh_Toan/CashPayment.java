package He_Thong_Thanh_Toan;

public class CashPayment implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Thanh toán" +amount +"bằng tiền mặt");
		
	}

}
