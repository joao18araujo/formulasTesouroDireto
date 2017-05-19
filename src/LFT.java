import java.util.Date;

public class LFT {

	private Date baseDate;
	private Date endDate;
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
	
	public Date getBaseDate() {
		return baseDate;
	}

	public void setBaseDate(Date baseDate) {
		this.baseDate = baseDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
