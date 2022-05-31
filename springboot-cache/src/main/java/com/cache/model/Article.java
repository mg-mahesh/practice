package com.cache.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.ToString;

@Data
@Entity
@ToString
public class Article {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long articleId;
	private String contents;
	private int likes;
}
