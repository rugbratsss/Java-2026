public class Politician{
	private String surname;
	private String position;
	private String politicalParty;
	
	public Politician(){
		surname = "SURNAME";
		position = "NOT APPOINTED YET";
		politicalParty = "MUST MAKE UP YOUR MIND";
	}
	
	
	public Politician(String surname,String position,String politicalParty){
		this.surname = surname;
		this.position = position;
		this.politicalParty = politicalParty;
	}
	
	public void setSurname(String surname){
		this.surname = surname;
	}
	public void setPosition(String position){
		this.position = position;
	}
	public void setPoliticalParty(String politicalParty){
		this.politicalParty = politicalParty;
	}
	
	public String getSurname(){
		return surname;
	}
	public String getPosition(){
		return position;
	}
	public String getPoliticalParty(){
		return politicalParty;
	}
	
	public boolean goodPolitician(int budget,double moneySpent){
		double percentage = (moneySpent/budget) * 100;
		return percentage < 100;
	}
}
