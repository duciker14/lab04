package duc.dev.models;

public class Ship extends Machine implements Run {
	
	String loaiTau;
	@Override
	public void Run() {
		// TODO Auto-generated method stub
		System.out.println("chay di tau");
		
	}
	

	public Ship(String tenMay, String bienSo, String loaiTau) {
		super(tenMay, bienSo);
		this.loaiTau = loaiTau;
	}
	
	

}
