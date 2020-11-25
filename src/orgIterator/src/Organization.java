
public class Organization {
	String name;
	String rank;
	int annual;
	
	public Organization(String name, String rank, int annual) {
		this.name=name;
		this.rank =rank;
		this.annual=annual;
	}
	
	public String getName() {
		return name;
	}

	public String getRank() {
		return rank;
	}

	public int getAnnual() {
		return annual;
	}

}
