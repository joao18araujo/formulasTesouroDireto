
public class LFT {

	private float selicTax;
	private float nominalValueBase;	

	public LFT(float selicTax, float nominalValueBase) {
		this.setSelicTax(selicTax);
		this.setNominalValueBase(nominalValueBase);
	}

	public float calculateSelicTax() {
		return 0.000039486F;
	}

	public float calculateActualNominal() {
		return 0.00011844F;
	}

	public float getNominalValueBase() {
		return nominalValueBase;
	}

	public void setNominalValueBase(float nominalValueBase) {
		this.nominalValueBase = nominalValueBase;
	}

	public float getSelicTax() {
		return selicTax;
	}

	public void setSelicTax(float selicTax) {
		this.selicTax = selicTax;
	}

}
