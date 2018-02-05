package entity2;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "car_engine_capacity")
public class CarEngineCapacity extends BaseEntity {

	
	@Column(name = "engine_capacity", columnDefinition = "DECIMAL(2,1)")
	private BigDecimal engineCapacity;
	
	@OneToMany(mappedBy = "carEngineCapacity", cascade = CascadeType.ALL)
	private List<CarModel> carModels;

	public CarEngineCapacity() {
		super();
	}

	public CarEngineCapacity(BigDecimal engineCapacity) {
		super();
		this.engineCapacity = engineCapacity;
	}
	
	

	public BigDecimal getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(BigDecimal engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public List<CarModel> getCarModels() {
		return carModels;
	}

	public void setCarModels(List<CarModel> carModels) {
		this.carModels = carModels;
	}

	@Override
	public String toString() {
		return "CarEngineCapacity [engineCapacity=" + engineCapacity + ", getId()=" + getId() + "]";
	}
	
	
}
