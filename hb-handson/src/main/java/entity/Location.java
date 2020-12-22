package entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Locations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Location {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Location_Id;
	private String Street_Address;
	private Integer Postal_Code;
	private String City;
	private String State_Province;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Integer Country_Id;

}
