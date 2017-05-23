import java.util.Calendar;
import java.util.Date;

public class NTNA6 {
	private double VE;
	private double VNA;
	
	public void setVE(double ve){
		VE = ve;
	}

	public void setVNA(double vna){
		VNA = vna;
	}
	
	public double calculateUpdatedNominalValue(double ussa, double ussb){	
		VNA = ussa/ussb * VE; 
		return VNA;
	}

	public double calculateInterest(Date dtp, Date dtup, double interest) {
		int dateDiff = calculateDifference(dtp, dtup);
		
		double fator = (dateDiff/360.0) * (interest/100);
		return fator * VNA;
	}

	private int calculateDifference(Date dtp, Date dtup) {
		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		end.setTime(dtp);
		start.setTime(dtup);
		
		int endDay = end.get(Calendar.DAY_OF_MONTH);
		int endMonth = end.get(Calendar.MONTH);
		int endYear = end.get(Calendar.YEAR);
		int endDays = endYear * 360 + endMonth * 30 + endDay; 

		int startDay = start.get(Calendar.DAY_OF_MONTH);
		int startMonth = start.get(Calendar.MONTH);
		int startYear = start.get(Calendar.YEAR);
		int startDays = startYear * 360 + startMonth * 30 + startDay;
		
		return endDays - startDays;
	}
}
