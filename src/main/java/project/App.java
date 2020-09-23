package project;

public class App {
	
	public String removingA(String string) {
		String updated="";
		
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)=='A'&& (i==0||i==1)) {
				updated=updated+"";
			}
			else {
				updated=updated+string.charAt(i);
			}
		}
		return updated;
		
	} 
}
