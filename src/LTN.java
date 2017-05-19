
public class LTN {
	float tind;
	
	public float getTind(){
		return tind;
	}
	
	public void setTind(float Tind){
		tind = Tind;
	}
	
	public double calculateUnitaryPrice(){
		double pu = 1000/(Math.pow(1 + tind, 1/252f));
		return pu;
	}
}
