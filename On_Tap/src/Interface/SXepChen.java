package Interface;

public class SXepChen implements SXep {

	@Override
	public void sXepTang(double[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			double key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	@Override
	public void sXepGiam(double[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			double key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] < key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

}
