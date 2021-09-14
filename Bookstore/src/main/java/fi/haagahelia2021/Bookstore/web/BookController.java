package fi.haagahelia2021.Bookstore.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fi.haagahelia2021.Bookstore.domain.Book;

@Controller
public class BookController {
	@RequestMapping("/index")
	public String showBooks (Model model) {
		ArrayList<Book> bookList = new ArrayList<>();
		bookList.add(new Book("Sagan om ringen", "Tolkien", "123-1231-123", 1932, 54));
		
		
		model.addAttribute("book",bookList);
		
		return "studentList";

	}
}
