package entity2;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "car_make")
public class CarMake extends BaseEntity {

	
	@Column(name = "make_title")
	private String makeTitle;
	
	@Column(name = "manufacture_year")
	private int manufactureYear;
	
	@OneToMany(mappedBy = "carMake")
	private List<Car> cars;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "model_id")
	private CarModel carModel;
	

	public CarMake() {
		super();
	}

	public CarMake(String makeTitle, int manufactureYear) {
		super();
		this.makeTitle = makeTitle;
		this.manufactureYear = manufactureYear;
	}
	
	

	public String getMakeTitle() {
		return makeTitle;
	}

	public void setMakeTitle(String makeTitle) {
		this.makeTitle = makeTitle;
	}

	public int getManufactureYear() {
		return manufactureYear;
	}

	public void setManufactureYear(int manufactureYear) {
		this.manufactureYear = manufactureYear;
	}

	

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public CarModel getCarModel() {
		return carModel;
	}

	public void setCarModel(CarModel carModel) {
		this.carModel = carModel;
	}

	@Override
	public String toString() {
		return "CarMake [makeTitle=" + makeTitle + ", manufactureYear=" + manufactureYear + ", getId()=" + getId()
				+ "]";
	}
	
	
	
}
