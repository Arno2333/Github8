package Github8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;




public class Book implements Comparable<Book> {
	int num;
	String title;
	String press;
	double price;

	public static void main(String[] args) {
		Book book1 = new Book(16027, "java", "java出版社", 40);
		Book book2 = new Book(16028, "c++", "c++出版社", 20);
		Book book3 = new Book(16029, "python", "python出版社", 40);
		Book book4 = new Book(16029, "c语言", "c语言出版社", 40);

	
		Map<Integer, Book> bookMap = new HashMap<>();
		bookMap.put(16027, book1);
		bookMap.put(16028, book2);
		bookMap.put(16029, book3);
		bookMap.put(16029, book4);

		
		List<Book> bookList = new ArrayList<Book>();
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		bookList.add(book4);

		
		Set<Book> bookSet = new HashSet<Book>();
		bookSet.add(book1);
		bookSet.add(book2);
		bookSet.add(book3);
		bookSet.add(book4);


		Set<Book> bookTreeSet = new TreeSet<Book>();
		bookTreeSet.add(book1);
		bookTreeSet.add(book2);
		bookTreeSet.add(book3);
		bookTreeSet.add(book4);


		System.out.println("-----------HashMap-----------");
		Set<Integer> keySet = bookMap.keySet();
		for (Integer num : keySet) {
			System.out.println(bookMap.get(num));
		}


		System.out.println("-----------ArrayList-----------");

		for (Book temp : bookList) {
			System.out.println(temp);
		}


		System.out.println("-----------HashSet-----------");

		for (Book temp : bookSet) {
			System.out.println(temp);
		}

	
		System.out.println("-----------TreeSet-----------");

		for (Book temp : bookTreeSet) {
			System.out.println(temp);
		}

	}

	// javabean
	public Book() {
		super();
	}

	public Book(int num, String title, String press, double price) {
		super();
		this.num = num;
		this.title = title;
		this.press = press;
		this.price = price;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPress() {
		return press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "num: " + num + "\ttitle: " + title + "\tprice: " + price + "\tpress: " + press;
	}

	@Override
	public int compareTo(Book o) {
		if (this.price < o.price) {
			return -1;
		} else if (this.price > o.price) {
			return 1;
		} else {
			if (this.num < o.num) {
				return -1;
			} else if (this.num > o.num) {
				return 1;
			} else {
				return 0;
			}
		}
	}

	@Override
	public int hashCode() {
		final int prime = 3;
		int result = 1;

		if (title != null) {
			result = result * prime + title.hashCode();
		}

		if (press != null) {
			result = result * prime + press.hashCode();
		}

		return (int) (result + num * prime + price * prime);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}

		if (getClass() != obj.getClass()) {
			return false;
		}

		Book other = (Book) obj;
		if (num != other.num) {
			return false;
		}

		if (price != other.price) {
			return false;
		}

		if (title == null) {
			if (other.title != null) {
				return false;
			}
		} else if (!title.equals(other.title)) {
			return false;
		}

		if (press == null) {
			if (other.press != null) {
				return false;
			}
		} else if (!press.equals(other.press)) {
			return false;
		}

		return true;

	}
}






































/*public class Book {
		public int numble;
		public int getNumble()
		{
			return numble;
		}
		public void setNumble(int numble) {
			this.numble=numble;
		}
	
	    private String name;
		public String getName()
		{
			   return name;
		}
		public void setName(String name)	{
			   this.name=name;
		}
		
		private int price;
		public int getPrice()
		{
			return price;
		}
		public void setPrice(int price) {
			this.price=price;
		}
		
		private String press;
		public String getPress()
		{
			   return press;
		}
		public void setPress(String press)	{
			   this.press=press;
		}
}
		*/