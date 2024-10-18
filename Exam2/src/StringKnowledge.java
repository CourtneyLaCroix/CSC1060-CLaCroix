
public class StringKnowledge {

	public static void main(String[] args) {
		String testString1 = "catcatcat"; //3
		String testString2 = "catcatdog"; //2
		String testString3 = "catdogca"; //1
		String testString4 = "backpack"; //0
		String testString5 = "examtimecatcat"; //2
		String testString6 = ""; //0

		System.out.println(howManyCat(testString1));

		String testString7 = "Hiabc";
		String testString8 = "abc";
		String testString9 = "abXabc";
		String testString10 = "pack";
		String testString11 = "z";
		String testString12 = "cat";

		System.out.println(endOther(testString12, testString1));

	}

	public static int howManyCat(String str) {
		int count = 0;
		str = str.toLowerCase();

		for(int i = 0; i < str.length()-2; i++) {
			if (str.substring(i, i + 3).equals("cat")) {
				count++;
			}
		}
		return count;
	}

	public static boolean endOther(String strfirst, String strsecond) {
		strfirst = strfirst.toLowerCase();
		strsecond = strsecond.toLowerCase();

		if (strfirst.length() > strsecond.length()) {
			for(int i = 0; i < strfirst.length();i++) {
				if (strfirst.endsWith(strsecond)) {
					return true;
				}
			}
		}
		if (strfirst.length() < strsecond.length()) {
			for(int i = 0; i < strsecond.length() ;i++) {
				if (strsecond.endsWith(strfirst)) {
					return true;
				}
			}
		}
		return false;
	}
}
