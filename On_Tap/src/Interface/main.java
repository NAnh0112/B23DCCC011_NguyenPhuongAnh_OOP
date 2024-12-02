package Interface;

public class main {
	public static void main(String[] args) {
		System.out.println("Test câu a");
		MayTinhCasio ca= new MayTinhCasio();
		MayTinhVina vi= new MayTinhVina();
		System.out.println("5+3="+ca.cong(5, 3));
		System.out.println("5+3="+vi.cong(5, 3));
		
		
		
		System.out.println("---------------");
		System.out.println("Test câu b");
		double[] arr1= new double[] {5,3,2,6,8,1};
		double[] arr2= new double[] {9,7,6,4,8,1,0};
		SXepChen chen= new SXepChen();
		SXepChon chon= new SXepChon();
		chen.sXepTang(arr1);
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" , ");
			
		}System.out.println();
		chon.sXepGiam(arr2);
		for (int i = 0; i < arr2.length; i++) {
			
			System.out.print(arr2[i]+" , ");
		}System.out.println();
		
		
		
		System.out.println("---------------");
		System.out.println("Test câu c");
		PhanMemMTinh mt1= new PhanMemMTinh();
		System.out.println("3+7="+ mt1.cong(3, 7));
		double[] arr3= new double[] {5,9,2,0,1,6};
		mt1.sXepTang(arr3);
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]+" , ");
			
		}System.out.println();
	
	
	}
}
