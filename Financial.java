
public abstract class Financial {
	public double Money;
	public double Interest;
	public double Month;
	public double Year;
	public double InterestAll;
	public double InterestMonth;
	public double MoneyFirst;
	public double Interestall;
	
	public void setFinancial(double money,double interest,double month) {
		Money=money;
		Interest=interest/100;
		Month=month;
		Year=month/12;
		MoneyFirst=money;
	}
	
	public double PayMonth() {
		return Money/Month;
	}
	
	public abstract double Interest();
	
	public abstract double Pay();
	
	public abstract void Print();
	
}
