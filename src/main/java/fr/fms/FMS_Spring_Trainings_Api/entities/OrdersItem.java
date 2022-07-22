/**
 * 
 */
package fr.fms.FMS_Spring_Trainings_Api.entities;


import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class OrdersItem {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderItemId;
	@ManyToOne
	private Orders orders;
	@ManyToOne
	private Training training;

	private int quantity;
	
	public OrdersItem(Orders orders, int quantity) {
		this.orders = orders;
		this.quantity = quantity;
	}

}
