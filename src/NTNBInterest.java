
public class NTNBInterest {

	double i;
	int n;
	int dcp;
	int dct;
	double vna;
	
	double interestFactor;
	double interest;
	
	public double calculateInterestFactor() {
		this.interestFactor = truncate(Math.pow(Math.pow((this.i/100.0) + 1.0, this.n/12.0), 1.0 * dcp/dct), 8); 
		return this.interestFactor;
	}
	
	public double calculateInterest() {
		return 0;
	}
	

	public double getVna() {
		return vna;
	}

	public void setVna(double vna) {
		this.vna = vna;
	}

	public double getInterestFactor() {
		return interestFactor;
	}

	public void setInterestFactor(double interestFactor) {
		this.interestFactor = interestFactor;
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
