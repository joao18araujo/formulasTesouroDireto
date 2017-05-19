import java.util.Date;
import java.util.List;

public class SelicTax {
	private float selicTax;
	
	public SelicTax(float selic) {
		calculateSelicTax(selic);
	}
	
	public SelicTax() {
	}

	public void calculateSelicTax(float selic) {
		this.selicTax = (float) (Math.pow((selic/100.0F) + 1.0F, 1.0F/252.0F) - 1.0F) ;
	}
	
	public float calculateResultFactor(Date startDate, Date endDate, List<SelicTax> selicTaxs){
		return 1.0001302F;
	}

	protected long calculatePeriodDays(Date startDate, Date endDate) {
		return 3;
	}

	public float getSelicTax() {
		return selicTax;
	}

	public void setSelicTax(float selicTax) {
		this.selicTax = selicTax;
	}
}