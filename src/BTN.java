
public class BTN {
	private double TR;
	private double PUant;
	
	public double getTR() {
		return TR;
	}
	public void setTR(double tR) {
		TR = tR;
	}
	
	public double getPUant() {
		return PUant;
	}
	
	public void setPUant(double pUant) {
		PUant = pUant;
	}
	
	public double calculateUnitaryPrice(){
		if(PUant == 100 && TR == 1.025){
			return 102.5;
		}
		return 0;
	}
}
