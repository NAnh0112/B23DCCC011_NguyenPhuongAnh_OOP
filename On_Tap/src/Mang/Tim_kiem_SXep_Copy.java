package Mang;

import java.util.Arrays;

public class Tim_kiem_SXep_Copy {
    public static void main(String[] args) {
        int[] a = new int[] {1, 8, 2, 6, 4, 3, 7, 9};
        int[] b = new int[15];

        System.out.println("a: " + Arrays.toString(a));

        // Sắp xếp mảng theo thứ tự tăng dần
        Arrays.sort(a);
        System.out.println("a sau khi sắp xếp tăng dần: " + Arrays.toString(a));

        // Hàm tìm kiếm
        System.out.println("Tìm kiếm giá trị 4 trong mảng: " + Arrays.binarySearch(a, 4)); // mảng đã sắp xếp

        // Hàm điền hết giá trị cho mảng b
        Arrays.fill(b, 5);
        System.out.println("b: " + Arrays.toString(b));
    }

 
}
