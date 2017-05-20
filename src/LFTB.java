
public class LFTB {
	
	private long du;
	private long dut;
	private int p;
	private int n;
	private float ve;
	
	public float calculateActualNominal(float c) {
		return (float) ((c * ve * Math.pow(1 + (0.000245F/100.0F), du/dut)) - 
			   ((c * ve * Math.pow(1 - 0.000245F, du/dut)) * (1/(p-n))));  
	}	
	
	public float getVe() {
		return ve;
	}

	public void setVe(float ve) {
		this.ve = ve;
	}

	public long getDu() {
		return du;
	}
	
	public void setDu(long du) {
		this.du = du;
	}
	
	public long getDut() {
		return dut;
	}
	
	public void setDut(long dut) {
		this.dut = dut;
	}
	
	public int getP() {
		return p;
	}
	
	public void setP(int p) {
		this.p = p;
	}
	
	public int getN() {
		return n;
	}
	
	public void setN(int n) {
		this.n = n;
	}
	
}
