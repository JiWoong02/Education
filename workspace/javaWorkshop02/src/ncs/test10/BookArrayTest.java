package ncs.test10;

public class BookArrayTest {

	public static void main(String[] args) {
		Book bk1 = new Book("자바의 정석", "남궁성", 30000, "도우출판", 0.1);
		Book bk2 = new Book("열혈강의 자바", "구정은", 29000, null, 0.1);
		Book bk3 = new Book("객체지향 JAVA8", "금영욱", 30000, null, 0.1);
		Book bArray[] = new Book[3];
		bArray[0] = bk1;
		bArray[1] = bk2;
		bArray[2] = bk3;
		for (Book b : bArray) {
			if (b.getPublisher() != null) {
				System.out.println(b.getTitle() + ", " + b.getAuthor() + ", " + b.getPublisher() + ", " + b.getPrice()
						+ " 원, " + (int) (b.getDiscountRate() * 100) + "% 할인\n" + "할인된 가격 : "
						+ (int) (b.getPrice() * (1 - b.getDiscountRate())) + " 원");
			}else {System.out.println(b.getTitle() + ", " + b.getAuthor() + ", " + b.getPrice()
			+ " 원, " + (int) (b.getDiscountRate() * 100) + "% 할인\n" + "할인된 가격 : "
			+ (int) (b.getPrice() * (1 - b.getDiscountRate())) + " 원");}
		}

	}

}
