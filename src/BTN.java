
public class BTN {
	private float TR;
	private float PUant;
	private float PUus;
	private float PUat;

	
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
	
	public float getPUus() {
		return PUus;
	}
	
	public void setPUus(float pUus) {
		PUus = pUus;
	}
	
	public float getPUat() {
		return PUat;
	}
	
	public void setPUat(float pUat) {
		PUat = pUat;
	}
	
	public float calculateUnitaryPrice(){
		return PUant * TR;
	}
	
	public double calculateInterest(float interestTax, int months) {
		double fj = Math.pow(1 + interestTax/100.0, months/12.0) - 1;
		return fj * PUat;
	}
	
	public float calculateMain(int qte, String type){
		float answer = 0;
		if(type == "USS"){
			answer = PUus * qte;
		}
		
		return answer;
	}
}
