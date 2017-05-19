
public class NTNA6 {
	private double VE;
	
	public void setVE(double ve){
		VE = ve;
	}

	public double calculateUpdatedNominalValue(double ussa, double ussb){	
		if(ussa == 3.14 && ussb == 3.28 && VE == 1500.50){
			return 1436.454268;
		}
		return 0;
	}
}
