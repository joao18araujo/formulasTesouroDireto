
public class BTN {
	private float TR;
	private float PUant;

	
	public float getTR() {
		return TR;
	}
	public void setTR(float tR) {
		TR = tR;
	}
	
	public float getPUant() {
		return PUant;
	}
	
	public void setPUant(float pUant) {
		PUant = pUant;
	}
	
	public float calculateUnitaryPrice(){
		return PUant * TR;
	}
	
	public double calculateInterest(float interestTax, int months) {
		double fj = Math.pow(1 + interestTax/100.0, months/12.0) - 1;
		System.out.println(fj);
		System.out.println(fj + " " + fj * PUant);
		
		return fj * PUant;
	}
}
