package fr.fms.FMS_Spring_Trainings_Api.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
//@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String mail;

	@NotNull
	private String password;
	private String name;
	private String firstName;
	private String address;
	private String phone;
	private String role;

	public Customer(Long id, String mail, String password, String name, String firstName, String address, String phone, String role) {
		this.id = id;
		this.mail = mail;
		this.password = password;
		this.name = name;
		this.firstName = firstName;
		this.address = address;
		this.phone = phone;
		this.role = role;
	}
}
