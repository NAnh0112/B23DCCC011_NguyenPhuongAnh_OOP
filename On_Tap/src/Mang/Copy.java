package Mang;
import java.util.Arrays;
public class Copy {
    private static final String Interger = null;

	public static void main(String[] args) {
        int[] mang1 = {1, 2, 3};
        
        
        int[] mang1_a = mang1;
        mang1_a[0] = 100;
        System.out.println("mang1_a = " + Arrays.toString(mang1_a));
        
        // hàm clone
        int[] mang1_b = mang1.clone();
        mang1_b[0] = 50;  
        System.out.println("mang1_b = " + Arrays.toString(mang1_b));
        
        //System.arraycopy
        int[] mang1_c = new int[mang1.length];
        System.arraycopy(mang1, 0, mang1_c, 0, mang1.length); 
        mang1_c[1] = 90;
        System.out.println("mang1_c = " + Arrays.toString(mang1_c));
    }
}
