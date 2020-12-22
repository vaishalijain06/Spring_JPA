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
@Table(name = "Regions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Region {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Region_Id;
	private String Region_name;
}
