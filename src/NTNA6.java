
public class NTNA6 {
	private double VE;
	
	public void setVE(double ve){
		VE = ve;
	}

	public double calculateUpdatedNominalValue(double ussa, double ussb){	
		double VNA = ussa/ussb * VE; 
		return VNA;
	}
}
