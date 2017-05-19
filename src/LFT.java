
public class LFT {

	private float nominalValueBase;	

	public LFT(float nominalValueBase) {
		this.setNominalValueBase(nominalValueBase);
	}

	public float calculateActualNominal(SelicTax selicTax) {
		return nominalValueBase * selicTax.getSelicTax();
	}

	public float getNominalValueBase() {
		return nominalValueBase;
	}

	public void setNominalValueBase(float nominalValueBase) {
		this.nominalValueBase = nominalValueBase;
	}

}
