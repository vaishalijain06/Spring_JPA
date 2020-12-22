package entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Countries")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Country {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Country_Id;
	private String Country_name;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Integer Region_Id;
}
