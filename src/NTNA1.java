import java.util.Date;
import java.util.concurrent.TimeUnit;

public class NTNA1 {
	
	float baseDolarQuotation;
	float endDolarQuotation;
	float liquidValue;
	
	public NTNA1(float baseDolarQuotation, float endDolarQuotation, float liquidValue) {
		super();
		this.baseDolarQuotation = baseDolarQuotation;
		this.endDolarQuotation = endDolarQuotation;
		this.liquidValue = liquidValue;
	}
	
	public NTNA1() {
	}

	public float getBaseDolarQuotation() {
		return baseDolarQuotation;
	}
	public void setBaseDolarQuotation(float baseDolarQuotation) {
		this.baseDolarQuotation = baseDolarQuotation;
	}
	public float getEndDolarQuotation() {
		return endDolarQuotation;
	}
	public void setEndDolarQuotation(float endDolarQuotation) {
		this.endDolarQuotation = endDolarQuotation;
	}
	public float getLiquidValue() {
		return liquidValue;
	}
	public void setLiquidValue(float liquidValue) {
		this.liquidValue = liquidValue;
	}

	public float calculatePUAmortization() {
		return (this.baseDolarQuotation/this.endDolarQuotation) * this.liquidValue;
	}

	public void setLiquidValue(float emissionValue, float amortizationPercentual) {
		this.liquidValue = emissionValue*amortizationPercentual;		
	}

	public float calculateInterestFactor(Date dtp, Date dtup, float interestTax) {
		long periodDays = TimeUnit.DAYS.convert(dtup.getTime() - dtp.getTime(), TimeUnit.MILLISECONDS);
		
		return ((float) periodDays / 360.0F) * (interestTax / 100.0F);
	}
	
	public float calculateInterestFactorSum(float... interestFactors) {
		float sum = 0.0F;
		
		for(int i = 0; i < interestFactors.length; ++i) {
			sum += interestFactors[i];
		}
		
		return sum;
	}

	public float calculateInterest(float PUAmortization, float interestFactorSum) {
		return PUAmortization * interestFactorSum;
	}

}
