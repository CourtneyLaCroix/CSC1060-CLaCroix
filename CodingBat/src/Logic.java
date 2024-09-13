
public class Logic {

	public static void main(String[] args) {
	

	}
	public int caughtSpeeding(int speed, boolean isBirthday) {
	  if (speed <= 60 || isBirthday && (speed <= 65)){
	    return 0;
	  }
	  if (speed <= 61 && >= 80 || isBirthday && (speed >= 85)){
	    return 1;
	  }
	  if (speed >= 81 || isBirthday && (speed >= 86)){
	    return 2;
	  }
	}
	public String alarmClock(int day, boolean vacation) {
	  if(!vacation && (day >= 1 && day <= 6)){
		    return "7:00";
		  }
		  if else (vacation && (day >= 1 && day <= 6)){
		    return "10:00";
		  }
		  if else (!vacation && (day == 0 || day == 7)){
		    return "10:00";
		  }
		  if else (vacation && (day == 0 || day == 7)) {
		    return "off";
		  }
		  return -1;

}
