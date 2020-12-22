package entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Employees")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Employee_Id;
	private String First_Name;
	private String Last_Name;
	private String Email;
	private Integer Phone_Number;
	private Date Hire_Date;
	private Integer Salary;
	private Integer Comission_PCT;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Integer Job_Id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Integer Manager_Id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Integer Department_Id;
	

}
