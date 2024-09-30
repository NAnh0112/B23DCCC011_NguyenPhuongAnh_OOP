package Ke_thua_boi_QLy_NVien;

public class TechnicalEmployee  implements Interface{
	private String name;

	public TechnicalEmployee(String name) {
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
		System.out.println(name + ": code");
		
	}

	@Override
	public void Salesperson() {
		// TODO Auto-generated method stub
		
	}
	
}
