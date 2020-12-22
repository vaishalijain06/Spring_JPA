package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Jobs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Job {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Job_Id;
	private String Job_Title;
	private Integer Min_Salary;
	private Integer Max_Salary;

}
