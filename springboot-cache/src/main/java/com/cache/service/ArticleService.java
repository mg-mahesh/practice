package com.cache.service;

import com.cache.model.Article;

public interface ArticleService {
	
	Article getArticle(Long articleId);
	void removeArticle(Long articleId);
	void saveArticle(Article article);
	Article updateLikes(Long articleId, int likes);

}
