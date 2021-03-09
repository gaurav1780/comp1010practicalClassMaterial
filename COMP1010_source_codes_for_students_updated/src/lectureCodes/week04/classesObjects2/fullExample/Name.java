package lectureCodes.week04.classesObjects2.fullExample;
public class Name {
	public String givenName, familyName, otherNames;

	
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
			givenName = name;
			otherNames = "";
			familyName = "";
			return;
		}
		
		//split String by spaces
		String[] tokens = name.split(" ");
		
		//given name only. rest ""
		if(tokens.length == 1) {
			givenName = tokens[0];
			familyName = "";
			otherNames = "";
			return;
		}
		
		//given name and family name. other names ""
		if(tokens.length == 2) {
			givenName = tokens[0];
			familyName = tokens[1];
			otherNames = "";
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
		
		givenName = tokens[0];
		familyName = tokens[tokens.length - 1];
	
		String middle = "";
		for(int i=1; i<tokens.length-1; i++)
			middle = middle + tokens[i] + " ";
		otherNames = middle.substring(0, middle.length()-1);
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
