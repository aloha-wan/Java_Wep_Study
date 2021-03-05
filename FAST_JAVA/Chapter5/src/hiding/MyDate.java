package hiding;

public class MyDate {
	
	// public private가 아닌 아무것도 입력하지 않은 디폴트인 경우 같은 패키지 내에서만 사용 가능하다.
	private int day;
	private int month;
	private int year;
	
	private boolean isValid;	// 초기 값은 false;
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			isValid = false;
		}else {
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void showDate() {
		if(isValid) {
			System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
		} else {
			System.out.println("유효하지 않은 날짜 입니다.");
		}
	}
}
