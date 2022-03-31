package Bootpac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookShop {
	String bookname="sai bio";
	int bookid =100;
	@Autowired
	bookdispl bs;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	@Override
	public String toString() {
		bs.displaycl();
		return "Bookname=" + bookname + ", bookid=" + bookid ;
	}
	

}
