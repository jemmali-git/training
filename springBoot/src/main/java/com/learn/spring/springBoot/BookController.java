package com.learn.spring.springBoot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@RequestMapping("/books")
	public List<Book> getBooks() {
		return Arrays.asList(new Book(1, "name1", "author1"),new Book(2, "name2", "author2"));
	}
}
