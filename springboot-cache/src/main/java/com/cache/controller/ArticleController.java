package com.cache.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cache.model.Article;
import com.cache.serviceImpl.ArticleServiceImpl;

@RestController
@RequestMapping("/cache")
public class ArticleController {
	
	@Autowired
	private ArticleServiceImpl articleService;
	
	@PostMapping("/saveArticle")
	public String saveArticle(@RequestBody Article article) throws Exception {
		articleService.saveArticle(article);
		return "Article stored Successfully..!";
	}
	
	@GetMapping("/getArticle/{id}")
	public ResponseEntity<Article> getItem(@PathVariable(value = "id") Long articleId) throws Exception {
		Article artilce = articleService.getArticle(articleId);
		return new ResponseEntity<Article>(artilce, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteItem(@PathVariable(value = "id") Long articleId) throws Exception {
		articleService.removeArticle(articleId);
		return "Article removed";
	}
	
	@PutMapping()
	public ResponseEntity<Article> updateLikes(@RequestParam(name = "articleId") Long articleId,
			@RequestParam(name = "likes") int likes) throws Exception {

		Article artilce = articleService.updateLikes(articleId, likes);
		return new ResponseEntity<Article>(artilce, HttpStatus.OK);
	}

}
