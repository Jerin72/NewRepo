package package1;

public class OffSeason extends OnSeason {
	
	public void discount()
	{
		discount = price *.15;
		System.out.println("Offseason Discount is "+discount);
	}

	public static void main(String[] args) {
		
		OffSeason s = new OffSeason();
		s.discount();
		OnSeason ss = new OnSeason();
		ss.discount(10000);

	}

}
