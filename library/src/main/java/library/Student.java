package library;

public class Student implements Book{

	@Override
	public String borrow() {
		// TODO Auto-generated method stub
		return "i will borrow";
	}

	@Override
	public String returnbook() {
		// TODO Auto-generated method stub
		return "i will return book";
	}

}
