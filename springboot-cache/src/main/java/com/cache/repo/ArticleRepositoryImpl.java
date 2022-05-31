package com.cache.repo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cache.model.Article;

@Repository
public class ArticleRepositoryImpl implements ArticleRepository {

	@PersistenceContext
	private EntityManager em;

	@Transactional
	@Override
	public void save(Article article) {
		em.persist(article);

	}

	@Transactional
	@Override
	public Article get(Long articleId) {
		return em.find(Article.class, articleId);
	}

	@Transactional
	@Override
	public void remove(Long articleId) {
		Article article = em.find(Article.class, articleId);
		em.remove(article);
	}

	@Transactional
	@Override
	public Article updateLikes(Long articleId, int likes) {
		Article newArticle = em.find(Article.class, articleId);
		newArticle.setLikes(likes);
		em.persist(newArticle);
		return newArticle;
	}
}
