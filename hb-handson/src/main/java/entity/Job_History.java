package entity;

import java.util.Date;

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
@Table(name = "Job_History")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Job_History {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Date Start_Date;
	private Date End_Date;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Integer Employee_Id;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Integer Department_Id;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Integer Job_Id;
	

}
