package secondspringpng;

public class Debit implements Payment {
Debit()
{
	System.out.println("debited");
}
	@Override
	public void paybill() {
		// TODO Auto-generated method stub
		System.out.println("it is debited");
	}

}
