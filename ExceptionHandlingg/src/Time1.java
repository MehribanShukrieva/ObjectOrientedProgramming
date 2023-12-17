
public class Time1 {
	private int hour;
	private int minute;
	private int second;
	public Time1(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	public void setHour(int h) {
		if(h<0 || h>23)
			throw new IllegalArgumentException("Wrong hour");
			this.hour = h;
	}
	public void setMinute(int m) {
		if(m<0 || m>59) 
			throw new IllegalArgumentException("Wrong minutes");
			this.minute=m;
	}
	public void setSecond(int s) {
		if(s<0 || s>59) 
			throw new IllegalArgumentException("Wrong seconds");
			this.second=s;
	}
	public String printTime() {
		return String.format("%02d: %02d: %02d ", hour, minute, second);
	}}