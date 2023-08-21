package com.masai.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.annotations.ManyToAny;


import jakarta.persistence.CascadeType;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String prodId;
	
	private String title;
	
	private String description;
	
	private Integer price;
	
	private Integer discountPrice;
	
	private Integer discountPrecent;
	
	private Integer quantity;
	
	private String brand;
	
	private String color;
	
	private String imageUrl;
	
	@Embedded
	@ElementCollection
	private Set<Size> sizes=new HashSet<>();
	
	@OneToMany(mappedBy = "product",cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Rating> ratings=new ArrayList<>();
	
	@OneToMany(mappedBy = "product",cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Review> reviews=new ArrayList<>();
	
	private int numRating;
	
	@ManyToOne
	private Category category;
	
	private LocalDateTime createAt;
	
	
	
	
	

}
