public class NTNA3 {

	float baseDolarQuotation;
	float endDolarQuotation;
	
	public float calculateNominalValue() {
		return (this.baseDolarQuotation / this.endDolarQuotation) * 1000.0F;
	}
	
	public float calculateInterestFactor(int i, int n) {
		return (float) ((i/100.0) * (n/12.0));
	}
	
	public float calculateInterest(float nominalValue, float interestFactor) {
		return nominalValue * interestFactor;
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
