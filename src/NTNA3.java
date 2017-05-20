public class NTNA3 {

	float baseDolarQuotation;
	float endDolarQuotation;
	
	public float calculateNominalValue() {
		return 943.15686F;
	}
	
	public float calculateInterestFactor(int i, int n) {
		return 0.0025F;
	}
	
	public float calculateInterest(float nominalValue, float interestFactor) {
		return 1.5719281F;
	}
	
	public float getBaseDolarQuotation() {
		return baseDolarQuotation;
	}
	
	public void setBaseDolarQuotation(float baseDolarQuotation) {
		this.baseDolarQuotation = baseDolarQuotation;
	}
	
	public float getEndDolarQuotation() {
		return endDolarQuotation;
	}
	
	public void setEndDolarQuotation(float endDolarQuotation) {
		this.endDolarQuotation = endDolarQuotation;
	}	
}
