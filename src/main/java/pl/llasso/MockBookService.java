package pl.llasso;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@Component
public class MockBookService {
    private static Long nextId = 4L;
    private List<Book> list;
    public MockBookService() {
        list = new ArrayList<>();
        list.add(new Book(1L, "9788324631766", "Thiniking	in	Java", "Bruce	Eckel", "Helion", "programming"));
        list.add(new Book(2L, "9788324627738", "Rusz	glowa	Java.", "Sierra	Kathy,	Bates	Bert", "Helion",
                "programming"));
        list.add(new Book(3L, "9780130819338", "Java	2.	Podstawy", "Cay	Horstmann,	Gary	Cornell", "Helion",
                "programming"));
    }
    @GetMapping("/books")
    public List<Book> bookList(){
        return list;
    }
    @GetMapping("/books/{id}")
    public Book bookById(){
        return null;
    }
    @PostMapping("/books")
    public void addBook(@RequestBody Book book){
        // operacje na obiekcie book
    }
    @PutMapping("/books")
    public void bookUpdate(@RequestBody Book book){

    }
    @DeleteMapping("/books/{id}")
    public void deleteBook(Long id){

    }

    @Override
    public String toString() {
        return "MockBookService{" +
                "list=" + list +
                '}';
    }
}
