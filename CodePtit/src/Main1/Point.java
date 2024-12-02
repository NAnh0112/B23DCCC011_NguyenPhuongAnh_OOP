package Main1;
import java.util.Scanner;
public class Point {
		 private double x;
		    private double y;

		    public Point() {
		        this.x = 0.0;
		        this.y = 0.0;
		    }
		    public Point(double x, double y) {
		        this.x = x;
		        this.y = y;
		    }
		    public Point(Point p) {
		        this.x = p.x;
		        this.y = p.y;
		    }

		    public double getX() {
		        return x;
		    }
		    public double getY() {
		        return y;
		    }
		    public double distance(Point secondPoint) {
		        return Math.sqrt(Math.pow(this.x - secondPoint.x, 2) + Math.pow(this.y - secondPoint.y, 2));
		    }
		    public static double distance(Point p1, Point p2) {
		        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
		    }
		    public String toString() {
		        return "(" + this.x + "," + this.y + ")";
		    }

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int test = sc.nextInt();
		        for (int i = 0; i < test; i++) {
		            double x1 = sc.nextDouble();
		            double y1 = sc.nextDouble();
		            double x2 = sc.nextDouble();
		            double y2 = sc.nextDouble();
		            Point p1 = new Point(x1, y1);
		            Point p2 = new Point(x2, y2);

		            double distance = Point.distance(p1, p2);
		            System.out.printf("%.4f%n",distance);

		        }
		    }
		}

