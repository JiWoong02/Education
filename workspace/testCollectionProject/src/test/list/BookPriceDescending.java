package test.list;

import java.util.Comparator;

public class BookPriceDescending implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		int result = 0;
		if(o1 instanceof Book&&o2 instanceof Book) {
			Book b1 = (Book)o1;
			Book b2 = (Book)o2;
//			result = b2.getPrice()-b1.getPrice();
			result = (b1.getPrice() < b2.getPrice())?1:(b1.getPrice()==b2.getPrice())?0:-1;
//		오름차순 : 	result = (b1.getPrice() > b2.getPrice())?1:(b1.getPrice()==b2.getPrice())?0:-1;
		}
		
		return result;
	}

}
