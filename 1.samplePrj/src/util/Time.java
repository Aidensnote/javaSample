package util;

public class Time {
	
	/* 1.�ɹ� �������+��ĸ�����̼� */
	private int hour;
	private int minute;
	private int second;
	private boolean am = true;	//����&����, ������� �ʱ�ȭ
	
	/* ������ �Լ� ���� */
	public Time(int hour, int minute, int second) {
		this.setHour(hour);
		this.setMinute(minute); //�̷��� ó���ؾ��� �Լ� ������ ����. ���������� �ٷ� ���� private.minute���� ����.
		this.setSecond(second);
	}
	/* boolean �߰��� ������ �Լ� ����� (set���� �������� ������ �޼ҵ尡 ������� �ʰ� �ٷ� ���� ����ȴ� */
	public Time(int hour, int minute, int second, boolean am) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		this.am = am;
	}

	/* ����Ʈ ������ */
	public Time() {

	}

	/* get&set �޼ҵ� */
	
	public boolean isAm() {			// ����&����
		return am;
	}
	public void setAm(boolean am) {
		this.am = am;
	}
	public int getHour() {
		return hour;
	}


	public void setHour(int hour) {
		/* ��ȿ�� �˻� */
		if(hour < 0 || hour >23)
			return;
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if(0>minute || minute>=60){		// 60�� ��ȿ��
			return;
		}
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if(0>second || second>=60){		// 60�� ��ȿ��
			return;
		}
		this.second = second;
	}

	/* toString �޼ҵ� = display �޼ҵ��� ��� */
	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
	}
	public void display() {
		String d = "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
		System.out.println(d);
	}
}
