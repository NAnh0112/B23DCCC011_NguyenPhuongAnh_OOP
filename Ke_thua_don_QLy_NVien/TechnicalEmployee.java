package Ke_thua_don_QLy_NVien;

public class TechnicalEmployee extends Staff{

	public TechnicalEmployee(String name, int age) {
		super(name, age);
	}
	
	private double working_hours;
	private double hourly_wage;
	public TechnicalEmployee(String name, int age, double working_hours, double hourly_wage) {
		super(name, age);
		this.working_hours = working_hours;
		this.hourly_wage = hourly_wage;
	}
	
	public double getWorking_hours() {
		return working_hours;
	}
	public void setWorking_hours(double working_hours) {
		this.working_hours = working_hours;
	}
	public double getHourly_wage() {
		return hourly_wage;
	}
	public void setHourly_wage(double hourly_wage) {
		this.hourly_wage = hourly_wage;
	}

	@Override
	public double Salary() {
		return this.hourly_wage* this.working_hours;
		
	}
	
	
	

}
