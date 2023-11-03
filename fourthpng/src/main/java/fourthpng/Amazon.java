package fourthpng;

public class Amazon {
	private Product pd;
	public Amazon(Product pd)
	{
		this.pd=pd;
	}
public String pass()
{
	return pd.items();
}
}
