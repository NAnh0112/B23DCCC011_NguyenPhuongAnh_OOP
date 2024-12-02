package Ke_thua_boi_QLy_NVien;

public class OfficeEmployee implements Interface{
	private String name;

	public OfficeEmployee(String name) {
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
		System.out.println(name + ": send Email");
		
	}

	@Override
	public void Programmer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Salesperson() {
		// TODO Auto-generated method stub
		
	}


	


	
	
}
