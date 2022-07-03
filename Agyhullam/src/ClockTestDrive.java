class Clock {// 88 oldal kijavítós feladat

	private String time;

	String getTime() {// itt volt a gond hogy voiddal vezette be a gettert pedig annak meg kell egyeznie 
		return time;// azzal amit föl kíván venni
	}

	void setTime(String t) {
		time = t;
	}

}

public class ClockTestDrive {

	public static void main(String[] args) {
		
		Clock c = new Clock();
		c.setTime("1245");
		String tod = c.getTime();
		System.out.println("time: " + tod);
	}

}
