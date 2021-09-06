package com.example.TestProject;

import com.example.TestProject.entities.Category;
import com.example.TestProject.entities.Comment;
import com.example.TestProject.entities.Product;
import com.example.TestProject.service.CategoryService;
import com.example.TestProject.service.CommentService;
import com.example.TestProject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;
import java.beans.Transient;
import java.util.Optional;

@SpringBootApplication
public class TestProjectApplication implements CommandLineRunner {

	@Autowired
	private ProductService productService;

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private CommentService commentService;

	public static void main(String[] args) {
		SpringApplication.run(TestProjectApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {

		Iterable<Product> products = productService.getProducts();
		products.forEach(p -> System.out.println(p.getName()));
//
//		Iterable<Comment> comments = commentService.getComments();
//		comments.forEach(comment -> System.out.println(comment.getContent()));
//
//		Iterable<Category> categories = categoryService.getCategories();
//		categories.forEach(category -> System.out.println(category.getName()));

		Optional<Product> optProducts = productService.getProductById(1);
		Product productId1 = optProducts.get();
		System.out.println(productId1.getName());
		System.out.println("test de récupération de commentaire =>"+ productId1.getComments().get(1).getContent());
//
//		Optional<Comment> optComment = commentService.getCommentById(1);
//		Comment commentId1 = optComment.get();
//		System.out.println(commentId1.getContent());
//
//		Optional<Category> optCategory = categoryService.getCategoryById(1);
//		Category categoryId1 = optCategory.get();
//		System.out.println(categoryId1.getName());

	}
}
