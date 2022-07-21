package fr.fms.FMS_Spring_Trainings_Api.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
//@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Category {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;


	@OneToMany(mappedBy="category") @JsonIgnore
	private Collection<Training>trainings;

	public Category(Long id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;

	}
}
