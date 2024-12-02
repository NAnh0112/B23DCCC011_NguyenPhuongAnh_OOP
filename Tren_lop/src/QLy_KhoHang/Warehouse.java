package QLy_KhoHang;

import java.util.ArrayList;
import java.util.List;

class Warehouse<T extends Product>{
	private List<T> pa;
	public Warehouse() {
		pa = new ArrayList<>();
	}
	
	public void add(T products) {
		pa.add(products);
	}
	
}


