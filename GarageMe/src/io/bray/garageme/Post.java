package io.bray.garageme;

import java.util.List;


import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	String description;
	String title;
	String author;
	
	@ElementCollection
	List<String> images;
}
