package duc.dev.models;

public class Cat extends Animal implements Run {
	  /*
	   * Thuoc tinh
	   */
      String mauMat;
      String mauLong;
      @Override
    public void Run() {
    	// TODO Auto-generated method stub
    	  System.out.println("chay ngay di");
    	
    }
	public Cat(String tenGoi, String canNang, String mauMat, String mauLong) {
		super(tenGoi, canNang);
		this.mauMat = mauMat;
		this.mauLong = mauLong;
	}
	

      
      
}
