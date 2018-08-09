import java.text.DecimalFormat;

public class Bank extends Financial{
		
	
	@Override
	public double Interest() {
		this.InterestMonth=MoneyFirst*Interest/12;
		MoneyFirst=MoneyFirst-PayMonth();
		return InterestMonth;
	}

	@Override
	public double Pay() {
		// TODO Auto-generated method stub
		double interestBank=Interest();
		this.Interestall=Interestall+interestBank;
		return PayMonth()+interestBank;
	}

	@Override
	public void Print() {
		// TODO Auto-generated method stub
		int i;
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("0.00");
		for(i=1;i<=Month;i++) {
		System.out.println("Month "+i+" FirstMoney= "+(df.format(MoneyFirst))+
				" Pay/Month= "+df.format(Pay())+" Interest/Month= "+df.format(InterestMonth));
		}
		System.out.println("INTEREST ALL = "+Interestall);
		
	}
}
