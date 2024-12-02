package Ke_thua_boi_QLy_NVien;

public class SalesEmployee implements Interface{
	private String name;

	public SalesEmployee(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void EmailSender() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Programmer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Salesperson() {
		System.out.println(name + ": sale");
		

	}}
