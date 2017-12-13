package util;

public class Time {
	
	/* 1.맴버 베리어블+인캡슐레이션 */
	private int hour;
	private int minute;
	private int second;
	private boolean am = true;	//오전&오후, 명시적인 초기화
	
	/* 생성자 함수 생성 */
	public Time(int hour, int minute, int second) {
		this.setHour(hour);
		this.setMinute(minute); //이렇게 처리해야지 함수 안으로 간다. 하지않으면 바로 위에 private.minute으로 들어간다.
		this.setSecond(second);
	}
	/* boolean 추가후 생성자 함수 재생성 (set으로 변경하지 않으면 메소드가 실행되지 않고 바로 위로 출려된다 */
	public Time(int hour, int minute, int second, boolean am) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		this.am = am;
	}

	/* 디폴트 생성자 */
	public Time() {

	}

	/* get&set 메소드 */
	
	public boolean isAm() {			// 오전&오후
		return am;
	}
	public void setAm(boolean am) {
		this.am = am;
	}
	public int getHour() {
		return hour;
	}


	public void setHour(int hour) {
		/* 유효성 검사 */
		if(hour < 0 || hour >23)
			return;
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if(0>minute || minute>=60){		// 60분 유효성
			return;
		}
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if(0>second || second>=60){		// 60분 유효성
			return;
		}
		this.second = second;
	}

	/* toString 메소드 = display 메소드은 기능 */
	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
	}
	public void display() {
		String d = "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
		System.out.println(d);
	}
}
