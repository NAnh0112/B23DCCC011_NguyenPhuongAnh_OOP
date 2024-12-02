package Main1;

import java.util.Scanner;

public class CVI_Tam_Giac {
	private double x,y;

	public CVI_Tam_Giac(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	public double distance(CVI_Tam_Giac secondPoint) {
        return Math.sqrt(Math.pow(this.x - secondPoint.x, 2) + Math.pow(this.y - secondPoint.y, 2));
    }
    public static double distance(CVI_Tam_Giac p1, CVI_Tam_Giac p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
        	CVI_Tam_Giac p1 = new CVI_Tam_Giac(sc.nextDouble(), sc.nextDouble());
        	CVI_Tam_Giac p2 = new CVI_Tam_Giac(sc.nextDouble(), sc.nextDouble());
        	CVI_Tam_Giac p3 = new CVI_Tam_Giac(sc.nextDouble(), sc.nextDouble());
            double a = p1.distance(p2);
            double b = p2.distance(p3);
            double c = p3.distance(p1);
            if (a + b <= c || a + c <= b || b + c <= a) {
                System.out.println("INVALID");
            } else {
                double perimeter = a + b + c;
                System.out.printf("%.3f\n", perimeter);
            }
        }
    }

	
}
