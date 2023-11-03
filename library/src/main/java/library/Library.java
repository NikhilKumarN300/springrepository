package library;

public class Library {
	private Book bk;

	
	public Library(Book bk) {
		super();
		this.bk = bk;
	}
	public String showstudent()
	{
		return bk.borrow();
	}
	public String showstaff()
			{
		return bk.borrow();
			}
	

}
