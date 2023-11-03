package firstspringpng;

public class Credit implements Payment{

	Credit()
	{
		System.out.println("object is created");
	}
	@Override
	public String hello() {
		// TODO Auto-generated method stub
		return "wellcome";
	}

}
