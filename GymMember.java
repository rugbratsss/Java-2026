public class GymMember{
	/* DATA MEMBERS*/
	private String memberName;
	private String membershipType;
	private int monthsJoined;
	private double monthlyRate;
	
	/* CONSTRUCTORS */
	public GymMember(String memberName, String membershipType, int monthsJoined, double monthlyRate){
		this.memberName = memberName;
		this.membershipType = membershipType;
		this.monthsJoined = monthsJoined;
		this.monthlyRate = monthlyRate;
	}
	/* ACCESSOE METHODS */
	public String getMemberName(){
		return memberName;
	}
	public String getMembershipType(){
		return membershipType;
	}
	public int getMonthsJoined(){
		return monthsJoined;
	}
	public double getMonthlyRate(){
		return monthlyRate;
	}
	
	/* MUTATOR METHODS */
	public void setMemberName(String memberName){
		this.memberName = memberName;
	}
	public void setMembershipType(String membershipType){
		this.membershipType = membershipType;
	}
	public void setMonthsJoined(int monthsJoined){
		this.monthsJoined = monthsJoined;
	}
	public void setMonthlyRate(double monthlyRate){
		this.monthlyRate = monthlyRate;
	}
	
	public double calculateTotalFee(){
		double rate = monthlyRate * monthsJoined;
		if(monthsJoined > 6){
			rate = rate * (1 - 0.10);
		}
		
		return rate;
	}

}
