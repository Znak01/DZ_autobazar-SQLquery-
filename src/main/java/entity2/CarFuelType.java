package entity2;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "car_fuel_type")
public class CarFuelType extends BaseEntity {

	@Column(name = "fuel_type")
	private String fuelType;
	
	@OneToMany(mappedBy = "carFuelType", cascade = CascadeType.ALL)
	private List<CarModel> carModels;


	public CarFuelType() {
		super();
	}

	public CarFuelType(String fuelType) {
		super();
		this.fuelType = fuelType;
	}
	
	

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public List<CarModel> getCarModels() {
		return carModels;
	}

	public void setCarModels(List<CarModel> carModels) {
		this.carModels = carModels;
	}

	@Override
	public String toString() {
		return "CarFuelType [fuelType=" + fuelType + ", getId()=" + getId() + "]";
	}
	
	
}
