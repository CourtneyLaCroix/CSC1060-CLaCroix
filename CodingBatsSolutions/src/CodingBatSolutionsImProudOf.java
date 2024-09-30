
public class CodingBatSolutionsImProudOf {

	public static void main(String[] args) {
		// Collections of coding bat solutions that I am super proud of. excited to re-do when better later

	}
	public String mixString(String a, String b) {
		  String conCatStr = a + b;
		  String newStr = "";
		  int i = 0;
		  
		while (i < a.length() || i < b.length()){
		  if (i < a.length()){
		    newStr = newStr + a.substring(i, i + 1);
		  }
		  if (i < b.length()){
		    newStr = newStr + b.substring(i, i + 1);
		  }
		  i++;
		}

		return newStr;
		  
		}
	
	public boolean hasBad(String str) {

		  if (str.length() >= 3 && str.substring(0,3).equals("bad")) {
		    return true;
		  }
		  if  (str.length() >= 4 && str.substring(1,4).equals("bad")) {
		    return true;
		  }
		  else{
		    return false;
		  }
		}
	
	public String middleThree(String str) {
		 	  
		  int x = str.length() / 2;
		  
		  return str.substring(x - 1, x + 2);
		}

	public boolean catDog(String str) {
		  int cat = 0;
		  int dog = 0;
		  
		 for (int i = 0; i < str.length() -2; i ++){
		   String check = str.substring(i, i + 3);
		   
		   if (check.equals("dog")){
		     dog++;
		   }
		   if (check.equals("cat")){
		     cat++;
		   }
		   
		 }
		  
		  if ((!str.contains("cat")) && (!str.contains("dog"))){
		    return true;
		  }
		  return cat == dog;
		}

	public String withoutX(String str) {

		if (str.length() > 1) {

			if ((str.charAt(0) == 'x') && (str.charAt(str.length()-1) == ('x'))) {
				return str.substring(1, str.length()-1);
			}


			else if (str.charAt(0) == 'x') {
				return str.substring(1);
			}
			else if (str.charAt(str.length()-1) == ('x')) {
				return str.substring(0, str.length()-1);
			}
			return str;
		}
		return "";
	}
}
