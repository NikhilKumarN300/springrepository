package secondspringpng;

public class CreditCard implements Payment{

	
	CreditCard()
	{
		System.out.println("credited");
	}
	@Override
	public void paybill() {
		// TODO Auto-generated method stub
		System.out.println("it is credited");
	}
	

}
