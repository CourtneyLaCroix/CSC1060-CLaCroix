
public class HomeworkTester {

	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		
		//for(i=0; i<10; i++);
		//	System.out.println(i + 4);
			
		int count = 0;
		
		while (i < 5) {
			i++;
			j = j * 2;
			System.out.println(j);
			
		}
		
		System.out.println("Welcome to Java");
	}
	public String withoutX(String str) {
		  if (str.charAt(0) == 'x') {
		    return str.substring(1);
		  }
		  if (str.chatAt(str.length()-1).equals('x')) {
		    return str.substring(0, str.length()-2);
		  }
		  return str;
		}

}
