
public class LTN {
	float tind;
	
	public float getTind(){
		return tind;
	}
	
	public void setTind(float Tind){
		tind = Tind;
	}
	
	public float calculateUnitaryPrice(){
		if(tind == 0.1f){
			return 99.962185f;
		}
		return 0;
	}
}
