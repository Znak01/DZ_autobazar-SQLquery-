package entity2;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "car_model")
public class CarModel extends BaseEntity {

	@Column(name = "model_title")
	private String modelTitle;
	
	@OneToOne(mappedBy = "carModel", cascade = CascadeType.ALL)
	private CarMake carMake;
	
	@ManyToOne(cascade = {CascadeType.DETACH, 
			CascadeType.MERGE, 
			CascadeType.PERSIST, 
			CascadeType.REFRESH}, fetch = FetchType.LAZY)
	@JoinColumn(name = "color_id")
	private CarColor carColor;
	
	@ManyToOne(cascade = {CascadeType.DETACH, 
			CascadeType.MERGE, 
			CascadeType.PERSIST, 
			CascadeType.REFRESH}, fetch = FetchType.LAZY)
	@JoinColumn(name = "engine_capacity_id,")
	private CarEngineCapacity carEngineCapacity;
	
	@ManyToOne(cascade = {CascadeType.DETACH, 
			CascadeType.MERGE, 
			CascadeType.PERSIST, 
			CascadeType.REFRESH}, fetch = FetchType.LAZY)
	@JoinColumn(name = "fuel_type_id,")
	private CarFuelType carFuelType;

	public CarModel() {
		super();
	}

	public CarModel(String modelTitle) {
		super();
		this.modelTitle = modelTitle;
	}

	
	
	public String getModelTitle() {
		return modelTitle;
	}

	public void setModelTitle(String modelTitle) {
		this.modelTitle = modelTitle;
	}

	public CarMake getCarMake() {
		return carMake;
	}

	public void setCarMake(CarMake carMake) {
		this.carMake = carMake;
	}

	public CarColor getCarColor() {
		return carColor;
	}

	public void setCarColor(CarColor carColor) {
		this.carColor = carColor;
	}

	public CarEngineCapacity getCarEngineCapacity() {
		return carEngineCapacity;
	}

	public void setCarEngineCapacity(CarEngineCapacity carEngineCapacity) {
		this.carEngineCapacity = carEngineCapacity;
	}

	public CarFuelType getCarFuelType() {
		return carFuelType;
	}

	public void setCarFuelType(CarFuelType carFuelType) {
		this.carFuelType = carFuelType;
	}

	@Override
	public String toString() {
		return "CarModel [modelTitle=" + modelTitle + ", getId()=" + getId() + "]";
	}
	
	
	
}
