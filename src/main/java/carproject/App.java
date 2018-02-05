package carproject;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity2.Car;
import entity2.CarColor;
import entity2.CarEngineCapacity;
import entity2.CarFuelType;
import entity2.CarMake;
import entity2.CarModel;
import entity2.CarSeller;

public class App 
{
    public static void main( String[] args ){
      
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysql");
    	EntityManager em = factory.createEntityManager();
    	
    	em.getTransaction().begin();
    	
//    	for (int i = 1; i <= 10; i++) {
//			CarSeller carSeller = new CarSeller("First_Name#" + i, "Last_Name#" + i, i + 10, 38097+i);
//			em.persist(carSeller);
//		}
//    	
//    	CarColor color = new CarColor("RED");
//    	CarColor color2 = new CarColor("WHITE");
//    	CarColor color3 = new CarColor("BLACK");
//    	CarColor color4 = new CarColor("SILVER");
//    	em.persist(color);
//    	em.persist(color2);
//    	em.persist(color3);
//    	em.persist(color4);
    	
//    	CarEngineCapacity engine = new CarEngineCapacity(new BigDecimal(1.1));
//    	CarEngineCapacity engine2 = new CarEngineCapacity(new BigDecimal(1.6));
//    	CarEngineCapacity engine3 = new CarEngineCapacity(new BigDecimal(0.9));
//    	em.persist(engine);
//    	em.persist(engine2);
//    	em.persist(engine3);
    	
//    	CarFuelType fuel = new CarFuelType("PETROL");
//    	CarFuelType fuel2 = new CarFuelType("GAS/PETROL");
//    	CarFuelType fuel3 = new CarFuelType("ELECTRIC");
//    	em.persist(fuel);
//    	em.persist(fuel2);
//    	em.persist(fuel3);
    	
    	CarModel model = new CarModel("QASHQAI");
    	model.setCarColor(new CarColor("RED"));
    	model.setCarEngineCapacity(new CarEngineCapacity(new BigDecimal(1.1)));
    	model.setCarFuelType(new CarFuelType("PETROL"));
    	
    	
    	CarMake make = new CarMake("DODGE", 2000);
//    	CarMake make2 = new CarMake("NISSAN,", 2009);
//    	CarMake make3 = new CarMake("AUDI", 1994);
    	make.setCarModel(model);
    	
    	em.persist(make);
//    	em.persist(make2);
//    	em.persist(make3);
    	
    	Car car = new Car(new BigDecimal(2000.60));
    	car.setCarSeller(new CarSeller("Vasa#", "Lob#", 22, 380972345));
    	car.setCarMake(make);
    	em.persist(car);
//    	car.setCarMake(new C);
    	
//    	CarModel model = new CarModel("QASHQAI");
//    	model.setCarColor(em.createQuery("SELECT c FROM car_color c WHERE c.id = :id", CarColor.class)
//				.setParameter("id", new Long(1)).getSingleResult());
//    	model.setCarEngineCapacity(em.createQuery("SELECT c FROM Car_Engine_Capacity c WHERE c.id = :id", CarEngineCapacity.class)
//    			.setParameter("id", new Long(1)).getSingleResult());
//    	model.setCarFuelType(em.createQuery("SELECT c FROM car_fuel_type c WHERE c.id = :id", CarFuelType.class)
//    			.setParameter("id", new Long(1)).getSingleResult());
//    	em.persist(model);
//    	CarModel model2 = new CarModel("RAM");
//    	CarModel model3 = new CarModel("Q7");
    	
    	em.getTransaction().commit();
    	
    	em.close();
    	factory.close();
    
    	
    	
    }
}
