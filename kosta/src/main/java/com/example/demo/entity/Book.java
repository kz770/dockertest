package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="book")
public class Book {
	@Id
	private int no;
	private String title;
	private int price;
	private String publisher;
}
