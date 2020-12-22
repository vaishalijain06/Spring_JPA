package entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Departments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Department_Id;
	private String Department_Name;
	@OneToMany(cascade = CascadeType.ALL)
	private Integer Manager_Id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Integer Location_Id;

}
