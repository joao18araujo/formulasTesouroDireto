
public class NTNB {
	private double IPCAt1;
	private double IPCAt0;
	private int dc;
	private int dct;
	
	private double IPCAt;
	private double VN;
	
	private double nominalValueFactor;
	private double nominalValue;
	
	public double getIPCAt1() {
		return IPCAt1;
	}
	
	public void setIPCAt1(double iPCAt1) {
		IPCAt1 = iPCAt1;
	}
	
	public double getIPCAt0() {
		return IPCAt0;
	}
	
	public void setIPCAt0(double iPCAt0) {
		IPCAt0 = iPCAt0;
	}
	
	public int getDc() {
		return dc;
	}
	
	public void setDc(int dc) {
		this.dc = dc;
	}
	
	public int getDct() {
		return dct;
	}
	
	public void setDct(int dct) {
		this.dct = dct;
	}

	public double getIPCAt() {
		return IPCAt;
	}

	public void setIPCAt(double iPCAt) {
		IPCAt = iPCAt;
	}

	public double getVN() {
		return VN;
	}

	public void setVN(double vN) {
		VN = vN;
	}

	public double calculateNominalValueFactor() {
		nominalValueFactor = truncate(Math.pow(IPCAt1 / IPCAt0, 1.0 * dc / dct), 6);
		return nominalValueFactor;
	}

	public double calculateNominalValue() {
		calculateNominalValueFactor();
		
		nominalValue = nominalValueFactor * (IPCAt / IPCAt0) * VN;
		
		return nominalValue;
	}
	
	private double truncate(double number, int positions){
		return number - number % Math.pow(10, -positions);
	}
	
	
}
