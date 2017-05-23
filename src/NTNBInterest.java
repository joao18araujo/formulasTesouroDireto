
public class NTNBInterest {

	double i;
	int n;
	int dcp;
	int dct;
	
	double intestFactor;
	

	public double calculateIntestFactor() {
		return truncate(Math.pow(Math.pow((this.i/100.0) + 1.0, this.n/12.0), 1.0 * dcp/dct), 8);
	}
	
	public double getI() {
		return i;
	}
	
	public void setI(double i) {
		this.i = i;
	}
	
	public int getN() {
		return n;
	}
	
	public void setN(int n) {
		this.n = n;
	}
	
	public int getDcp() {
		return dcp;
	}
	
	public void setDcp(int dcp) {
		this.dcp = dcp;
	}
	
	public int getDct() {
		return dct;
	}
	
	public void setDct(int dct) {
		this.dct = dct;
	}
	
	private double truncate(double number, int positions){
		return number - number % Math.pow(10, - positions);		  	
	}
}
