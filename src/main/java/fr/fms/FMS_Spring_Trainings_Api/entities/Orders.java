/**
 * 
 */
package fr.fms.FMS_Spring_Trainings_Api.entities;

import java.util.Collection;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Data
//@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Orders {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ordersId;
	private Long customerId;
	private Date date;
	private double amount;

	
	public Orders(Long ordersId, Long customerId, Date date, double amount) {
		this.ordersId = ordersId;
		this.customerId = customerId;
		this.date = date;
		this.amount = amount;
	}

}
