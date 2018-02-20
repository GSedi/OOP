
public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time() {}
	
	public Time(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public String Universal() {
		String s = "";
		if(hour < 10) {
			s = s + "0" + hour + ":";
		}
		else {
			s += hour + ":";
		}
		
		if(minute < 10) {
			s = s + "0" + minute + ":";
		}
		else {
			s += minute + ":";
		}
		if(second < 10) {
			s = s + "0" + second;
		}
		else {
			s += second;
		}
		
		return s;
	}
	
	public String Standard() {
		String s = "";
		if(hour < 12 && hour > 0) {
			if(hour < 10) {
				s = s + "0" + hour + ":";
			}
			else {
				s += hour + ":";
			}
			
			if(minute < 10) {
				s = s + "0" + minute + ":";
			}
			else {
				s += minute + ":";
			}
			if(second < 10) {
				s = s + "0" + second;
			}
			else {
				s += second;
			}
			
			s += " AM";
		}
		else if(hour > 12){
			hour -= 12;
			if(hour < 10) {
				s = s + "0" + hour + ":";
			}
			else {
				s += hour + ":";
			}
			
			if(minute < 10) {
				s = s + "0" + minute + ":";
			}
			else {
				s += minute + ":";
			}
			if(second < 10) {
				s = s + "0" + second;
			}
			else {
				s += second;
			}
			
			s += " PM";
		}
		else if(hour == 12) {
			s += 12 + ":" ;
			if(minute < 10) {
				s = s + "0" + minute + ":";
			}
			else {
				s += minute + ":";
			}
			if(second < 10) {
				s = s + "0" + second;
			}
			else {
				s += second;
			}
			
			s += " PM";
		}
		else if(hour == 0) {
			s += 12 + ":";
			
			if(minute < 10) {
				s = s + "0" + minute + ":";
			}
			else {
				s += minute + ":";
			}
			if(second < 10) {
				s = s + "0" + second;
			}
			else {
				s += second;
			}
			
			s += " AM";
		}
		return s;
	}
	
	
	public Time add(Time t) {
		Time time = new Time();
		time.hour = this.hour + t.hour;
		time.minute = this.minute + t.minute;
		time.second = this.second + t.second;
		
		if(time.second > 59) {
			time.minute += time.second/60;
			time.second %= 60; 
		}
		if(time.minute > 59) {
			time.hour += time.minute/60;
			time.minute %= 60; 
		}
		if(time.hour > 23) {
			time.hour = time.hour - 24;
		}
		
		return time;
		/*this.hour = time.hour;
		this.minute = time.minute;
		this.second = time.second;
		*/
	}
	
	public String toString(int x) {
		String s = "";
		s += x;
		return s;
	}
}
