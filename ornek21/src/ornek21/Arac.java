package ornek21;

public class Arac {
	private double hiz;
	private double yol;
	private String marka;
	
	public Arac(String marka) {
		hiz=0;
		yol=0;
		this.marka = marka;
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
	public String getMarka(){
	   return marka;
	}
}
