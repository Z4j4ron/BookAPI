package pl.llasso.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.llasso.Book;
import pl.llasso.BookService;
import pl.llasso.MockBookService;

import java.util.List;


@RestController
@RequestMapping("/books")
public class BookController {

    @RequestMapping
        public MockBookService view(){
        return new MockBookService();
    }
}

