package entity2;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "car_color")
public class CarColor extends BaseEntity {

	@Column(name = "color")
	private String color;
	
	@OneToMany(mappedBy = "carColor", cascade = CascadeType.ALL)
	private List<CarModel> carModels;

	public CarColor() {
		super();
	}

	public CarColor(String color) {
		super();
		this.color = color;
	}
	
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public List<CarModel> getCarModels() {
		return carModels;
	}

	public void setCarModels(List<CarModel> carModels) {
		this.carModels = carModels;
	}

	@Override
	public String toString() {
		return "CarColor [color=" + color + ", getId()=" + getId() + "]";
	}
	
	
	
}
