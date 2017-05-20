
public class LFTB {

	public final float aditionalTax = 0.000245F;
	
	private long workingDays;
	private long nextWorkingDays;
	private int quantityPortion;
	private int quantityAmortizedPortion;
	private float nominalValue;
	
	public float calculateActualNominalValue(float productFactor) {	
		return calculateFirstStep(productFactor) - (calculateSecondStep(productFactor) * calculateThirdStep());  
	}

	private float calculateThirdStep() {
		return 1.0F/(float)(quantityPortion-quantityAmortizedPortion);
	}

	private float calculateSecondStep(float productFactor) {
		return (float) (productFactor * nominalValue * Math.pow(1 - aditionalTax, workingDays/nextWorkingDays));
	}

	private float calculateFirstStep(float productFactor) {
		return (float) (productFactor * nominalValue * Math.pow(1 + (aditionalTax/100.0F), workingDays/nextWorkingDays));
	}
	
	public float getNominalValue() {
		return nominalValue;
	}

	public void setNominalValue(float ve) {
		this.nominalValue = ve;
	}

	public long getWorkingDays() {
		return workingDays;
	}
	
	public void setWorkingDays(long du) {
		this.workingDays = du;
	}
	
	public long getNextWorkingDays() {
		return nextWorkingDays;
	}
	
	public void setNextWorkingDays(long dut) {
		this.nextWorkingDays = dut;
	}
	
	public int getQuantityPortion() {
		return quantityPortion;
	}
	
	public void setQuantityPortion(int p) {
		this.quantityPortion = p;
	}
	
	public int getQuantityAmortizedPortion() {
		return quantityAmortizedPortion;
	}
	
	public void setQuantityAmortizedPortion(int n) {
		this.quantityAmortizedPortion = n;
	}
	
	public float getAditionalTax() {
		return aditionalTax;
	}
}
