package duc.dev.models;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Cat cat = new Cat("meo tom","34","mau do","mau xam");
     System.out.println("can nang meo la " +cat.canNang);
     cat.anUong();
     cat.Run();
     
     System.out.println("============");
     
     Ship ship = new Ship("tau 222", "74k6522", "tau pro");
     System.out.println(ship.tenMay);
     ship.Run();
	}

}
