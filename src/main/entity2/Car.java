package entity2;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class Car extends BaseEntity {

	@Column(name = "sell_price", columnDefinition = "DECIMAL(5,2)")
	private BigDecimal sellPrice;
	
	@ManyToOne(cascade = {CascadeType.DETACH, 
			CascadeType.MERGE, 
			CascadeType.PERSIST, 
			CascadeType.REFRESH}, fetch = FetchType.LAZY)
	@JoinColumn(name = "make_id")
	private CarMake carMake;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "seller_id")
	private CarSeller carSeller;
	

	public Car() {
		super();
	}

	public Car(BigDecimal sellPrice) {
		super();
		this.sellPrice = sellPrice;
	}

	
	
	public BigDecimal getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(BigDecimal sellPrice) {
		this.sellPrice = sellPrice;
	}

	public CarMake getCarMake() {
		return carMake;
	}

	public void setCarMake(CarMake carMake) {
		this.carMake = carMake;
	}

	public CarSeller getCarSeller() {
		return carSeller;
	}

	public void setCarSeller(CarSeller carSeller) {
		this.carSeller = carSeller;
	}

	@Override
	public String toString() {
		return "Car [sellPrice=" + sellPrice + ", getId()=" + getId() + "]";
	}

	
	
}
