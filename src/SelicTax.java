import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

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
		long periodDays = calculatePeriodDays(startDate, endDate);

		float productResult = (float) (1.0 + selicTaxs.get(0).getSelicTax());
		for(long k = 1; k < periodDays; ++k) {
			productResult *= (1.0 + selicTaxs.get((int) k).getSelicTax());
		}

		return productResult;
	}

	protected long calculatePeriodDays(Date startDate, Date endDate) {
		long diff = endDate.getTime() - startDate.getTime();
		long periodDays = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

		return periodDays;
	}

	public float getSelicTax() {
		return selicTax;
	}

	public void setSelicTax(float selicTax) {
		this.selicTax = selicTax;
	}
}
