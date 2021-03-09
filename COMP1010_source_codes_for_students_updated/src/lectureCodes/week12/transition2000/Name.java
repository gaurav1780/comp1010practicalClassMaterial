package lectureCodes.week12.transition2000;
public class Name {
	public String givenName, familyName, otherNames;

	//getters

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public void setOtherNames(String otherNames) {
		this.otherNames = otherNames;
	}
	
	public String getGivenName(){
		return givenName;
	}
	
	public String getFamilyName(){
		return familyName;
	}
	
	public String getOtherNames() {
		return otherNames;
	}
	/**
	 * creates a name based on number of space-separated
	 * tokens in the parameter String.
	 * 
	 * if there is just one token - it's the given name (like "Madonna")
	 * if there are two tokens - they're the given and family names
	 * if there are more than two tokens - the first token is the given name,
	 * the LAST token is the family name, and a concatenation of all other tokens,
	 * separated by a space are the other names. For example,
	 * if parameter is "john luiz william smith", then
	 * given name is "john"
	 * family name is "smith"
	 * other names are "luiz william"
	 * 
	 * when a value for any of the data members is not present,
	 * it should be set to ""
	 * @param name
	 */
	public Name(String name) {
		//BEGIN OF DO-NOT-MODIFY CODE
		//empty or null String
		if(name==null || name.length() == 0) {
			setGivenName("");
			setFamilyName("");
			setOtherNames("");
			return;
		}
		
		//split String by spaces
		String[] tokens = name.split(" ");
		
		//given name only. rest ""
		if(tokens.length == 1) {
			setGivenName(tokens[0]);
			setFamilyName("");
			setOtherNames("");
			return;
		}
		
		//given name and family name. other names ""
		if(tokens.length == 2) {
			setGivenName(tokens[0]);
			setFamilyName(tokens[1]);
			setOtherNames("");
			return;
		}
		//END OF DO-NOT-MODIFY CODE
		
		/*
		 * code for 3 or more String tokens should be completed.
		 * first token should be assigned to given name
		 * last token should be assigned to family name
		 * second to second-last tokens should be combined
		 * (with a space between each token) and that 
		 * String should be assigned to other names.
		 */
		
		/*
		 *  ************  TO BE COMPLETED  ************
		 */
		
		setGivenName(tokens[0]);
		setFamilyName(tokens[tokens.length - 1]);
	
		String middle = "";
		for(int i=1; i<tokens.length-1; i++)
			middle = middle + tokens[i] + " ";
		setOtherNames(middle.substring(0, middle.length()-1));
	}
	
	/**
	 * if otherNames and familyName are "", return givenName
	 * 
	 * else if ONLY otherName is "", return "givenName familyName"
	 * 
	 * else return  "givenName otherNames familyName" format
	 */
	public String toString() {
		if(otherNames == "" && familyName == "")
			return givenName;
		if(otherNames == "")
			return givenName+" "+familyName;
		return givenName+" "+otherNames+" "+familyName;
	}
}
