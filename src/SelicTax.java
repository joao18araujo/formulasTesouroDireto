
public class SelicTax {
	private float selicTax;

	public SelicTax(float selicTax) {
		this.selicTax = selicTax;
	}
	
	public SelicTax() {
	}

	public void calculateSelicTax(float selic) {
		this.selicTax = (float) (Math.pow((selic/100.0F) + 1.0F, 1.0F/252.0F) - 1.0F) ;
	}

	public float getSelicTax() {
		return selicTax;
	}

	public void setSelicTax(float selicTax) {
		this.selicTax = selicTax;
	}
}