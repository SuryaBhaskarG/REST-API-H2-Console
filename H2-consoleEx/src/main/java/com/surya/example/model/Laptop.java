package com.surya.example.model;

import java.time.LocalDate;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

public class Laptop {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long sno;
	private String name;
	private LocalDate date;
	

}

