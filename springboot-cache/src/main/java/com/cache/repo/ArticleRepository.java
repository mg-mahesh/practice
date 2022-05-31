package com.cache.repo;

import com.cache.model.Article;

public interface ArticleRepository {

	void save(Article article);	
	Article get(Long articleId);	
	void remove(Long articleId);	
	Article updateLikes(Long articleId, int likes);

}
