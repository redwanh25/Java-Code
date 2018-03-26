package abstract_interface;

// please read 198 page, interface vs abstract (A N M bojlur rahman)

interface Payment {
	long getPayment();
}

class Bkash implements Payment {
	@Override
	public long getPayment() {
		System.out.print("Bkash ");
		return 100;
	}
}

class Brac implements Payment {
	@Override
	public long getPayment() {
		System.out.print("Brac ");
		return 200;
	}
}

class PaymentEngine {
	public void accepted(Payment p) {
		System.out.println(p.getPayment());
	}
}

public class InterfaceRealLife {

	public static void main(String[] args) {
		PaymentEngine E = new PaymentEngine();
		
		Bkash B = new Bkash();
		E.accepted(B);
		
		Brac C = new Brac();
		E.accepted(C);
	}

}
