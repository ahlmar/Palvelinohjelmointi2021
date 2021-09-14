package fi.haagahelia2021.Bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.haagahelia2021.Bookstore.domain.Book;
import fi.haagahelia2021.Bookstore.domain.BookRepository;

@SpringBootApplication
public class BookstoreApplication {
	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner bookDemo(BookRepository repository) {
		return (args) -> {
			log.info("Saving some books");
			repository.save(new Book("Sagan om ringen","olkien", "123-123-123", 1943, 53));
			repository.save(new Book("Tuntematon sotilas", "Väinö Linna", "321-321-321", 1950, 50));
					
		};
	}
}
