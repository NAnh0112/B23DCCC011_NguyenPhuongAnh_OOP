package Ke_thua_don_QLy_NVien;

public class OfficeEmployee extends Staff {
	private int day;
	private double daily_salary;

	public OfficeEmployee(String name, int age) {
		super(name, age);
	}

	public OfficeEmployee(String name, int age, int day, double daily_salary) {
		super(name, age);
		this.day = day;
		this.daily_salary = daily_salary;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public double getDaily_salary() {
		return daily_salary;
	}

	public void setDaily_salary(double daily_salary) {
		this.daily_salary = daily_salary;
	}

	@Override
	public double Salary() {
		return this.day * this.daily_salary;
	}

	

	
	
	
}
