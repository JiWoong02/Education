package array3.model;

public class Book {
		//Field
	    private String title;			//책제목
		private String author;		//저자명
		private int price;				//책가격
		private String publisher;	//출판사
		public Book() {}
		public Book(String title, String author, int price, String publisher) {
			super();
			this.title = title;
			this.author = author;
			this.price = price;
			this.publisher = publisher;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getPublisher() {
			return publisher;
		}
		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}
		//method
		public String boolInfo() {
			return "Book [" + this.title + ", " + this.author + ", " + this.price + ", " + this.publisher + "]";
		}
		
}//class
