package pl.javastart.api;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/books")
class BookController  {

    @GetMapping(produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    List<Book> getAllBooks() {
        return List.of(
                new Book("Harry Potter", "J.K. Rowling", 1997, 223),
                new Book("Władca Pierścieni", "J.R. Tolkien", 1972, 333),
                new Book("Latarnik", "Henryk Sienkieiwcz", 1981, 232)
        );
    }

    @GetMapping("/1")
    Book getSingleBook()  {
        return new Book("Harry Potter", "J.K. Rowling", 1997, 223);
    }


}
