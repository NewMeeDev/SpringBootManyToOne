/**
 * 
 */
package com.mneumann1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author MNEUMANN1
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student {
	
	@Id
	private Integer id;
	
	private String name;

	@ManyToOne
	@JoinColumn(name = "book_id")
	private Book book;
}
