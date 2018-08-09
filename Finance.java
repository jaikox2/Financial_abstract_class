
public class Finance extends Financial{


	@Override
	public double Interest() {
		// TODO Auto-generated method stub
		return Money*Interest*Year;
	}

	@Override
	public double Pay() {
		// TODO Auto-generated method stub
		this.InterestAll=Interest();           
		double InterestMonth=InterestAll/ Month;
			return PayMonth()+InterestMonth;
	}

	@Override
	public void Print() {
		// TODO Auto-generated method stub
		System.out.println("Pay / Month = "+Pay());
		System.out.println("InteresrAll = "+Interest());
	}

	
}
