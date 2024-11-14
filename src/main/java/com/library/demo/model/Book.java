package com.library.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Book {
	

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @NotBlank(message = "Title is required.")
	    private String title;

	    @NotBlank(message = "Author is required.")
	    private String author;

	    @NotNull(message = "Publication year is required.")
	    @Min(value = 1000, message = "Publication year should be a valid year.")
	    private Integer publicationYear;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public Integer getPublicationYear() {
			return publicationYear;
		}

		public void setPublicationYear(Integer publicationYear) {
			this.publicationYear = publicationYear;
		}

		@Override
		public String toString() {
			return "Book [id=" + id + ", title=" + title + ", author=" + author + ", publicationYear=" + publicationYear
					+ "]";
		}
	    
	    

}
