package ornek21;

public class Arac {
	private double hiz;
	private double yol;
	
	public Arac() {
		hiz=0;
		yol=0;
	}
	public void hizlan(double hiz) {
		this.hiz = hiz;
	}
	public void sur(int saat) {
		yol = hiz*saat;
	}
	public double getYol() {
		return yol;
	}
}
