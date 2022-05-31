package com.cache.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.cache.model.Article;
import com.cache.repo.ArticleRepository;
import com.cache.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {
	
	@Autowired
	private ArticleRepository articleRepository;

	@Override
	@Cacheable(cacheNames = "article", key = "#articleId")
	public Article getArticle(Long articleId) {
		return articleRepository.get(articleId);
	}

	@Override
	@CacheEvict(cacheNames = "articles", key = "#articleId")
	public void removeArticle(Long articleId) {
		articleRepository.remove(articleId);
	}

	@Override
	public void saveArticle(Article article) {
		articleRepository.save(article);
	}

	@Override
	@CachePut(cacheNames = "articles", key = "#articleId")
	public Article updateLikes(Long articleId, int likes) {
		return articleRepository.updateLikes(articleId, likes);
	}

}
