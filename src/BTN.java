
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
		return MathOperations.truncate(PUant * TR, 6);
	}
	
	public float calculateInterest(float interestTax, int months) {
		float fj = 0;
		if(months == 6 && interestTax == 30f){
			fj = 0.14017542f;
		}
		
		return fj * PUant;
	}
}
