package carproject;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

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
    	

//    	CarModel model = new CarModel("QASHQAI");
//    	model.setCarColor(new CarColor("RED"));
//    	model.setCarEngineCapacity(new CarEngineCapacity(new BigDecimal(1.1)));
//    	model.setCarFuelType(new CarFuelType("PETROL"));
//    	em.persist(model);
//    	
//    	CarMake make = new CarMake("DODGE", 2000);
//    	CarModel model = em.createQuery("SELECT m FROM CarModel m WHERE m.id = :id", CarModel.class)
//				.setParameter("id", new Long(1)).getSingleResult();
//    	System.out.println(model);
//    	make.setCarModel(model);
//    	em.persist(make);
    	
//    	Car car = new Car(new BigDecimal(200.60));
//    	car.setCarSeller(em.createQuery("SELECT m FROM CarSeller m WHERE m.id = :id", CarSeller.class)
//    			.setParameter("id", new Long(1)).getSingleResult());
//    	car.setCarMake(em.createQuery("SELECT m FROM CarMake m WHERE m.id = :id", CarMake.class)
//    			.setParameter("id", new Long(1)).getSingleResult());
//    	em.persist(car);   
    	
    	
    	
    	
    	
//    	!!!!! CREATE DATA !!!!!!
    	
    	//    	for (int i = 1; i <= 10; i++) {
//			CarSeller carSeller = new CarSeller("First_Name#" + i, "Last_Name#" + i, i + 10, 38097+i);
//			em.persist(carSeller);
//		}   	
	
//    	for (int i = 2; i < 10; i++) {
//    		CarModel model = new CarModel("QASHQAI%"+i);
//        	model.setCarColor(new CarColor("RED@"+i));
//        	model.setCarEngineCapacity(new CarEngineCapacity(new BigDecimal(i+0.5)));
//        	model.setCarFuelType(new CarFuelType("PETROL#"+i));
//        	em.persist(model);
//		}
//    	
//    	for (int i = 2; i < 10; i++) {
//    		CarMake make = new CarMake("DODGE$"+i, 2000 + i);
//        	CarModel model = em.createQuery("SELECT m FROM CarModel m WHERE m.id = :id", CarModel.class)
//    				.setParameter("id", new Long(i)).getSingleResult();
//        	make.setCarModel(model);
//        	em.persist(make);
//		}
//    	
//    	for (int i = 2; i < 8; i++) {
//    		Car car = new Car(new BigDecimal(i * 100.60));
//        	car.setCarSeller(em.createQuery("SELECT m FROM CarSeller m WHERE m.id = :id", CarSeller.class)
//        			.setParameter("id", new Long(i)).getSingleResult());
//        	car.setCarMake(em.createQuery("SELECT m FROM CarMake m WHERE m.id = :id", CarMake.class)
//        			.setParameter("id", new Long(i)).getSingleResult());
//        	em.persist(car);
//		}
    	
//    	!!!!!!!!!!!!!!!
    	
    	
//    	!!!!! QUERY JPQL !!!!!!
    	
//    	1
//    	List<Car> car = em
//    			 .createQuery("SELECT c FROM Car c WHERE c.id BETWEEN :start AND :finish", Car.class)
//    			 .setParameter("start", new Long(2))
//    			 .setParameter("finish", new Long(4))
//    			 .getResultList();
//    	   car.forEach(c -> System.out.println(c));
    	   
//    	2
//    	Car car = em.createQuery("SELECT c FROM Car c WHERE c.id = :id",
//    			   Car.class)
//    				 .setParameter("id", new Long(1)).getSingleResult();
//    				 System.out.println(car);
    	
//    	3
//    	List<CarSeller> cars = em.createQuery("SELECT c FROM CarSeller c WHERE c.phoneNumber LIKE '%0_' ", CarSeller.class)
//    			.getResultList();
//    	cars.forEach(c -> System.out.println(c));

//    	4
//    	CarModel model = em
//				.createQuery("SELECT DISTINCT c FROM CarModel c JOIN FETCH c.carColor c WHERE c.id = :id", CarModel.class)
//				.setParameter("id", new Long(3)).getSingleResult();
//		System.out.println(model);  
//    	                                         !!!!! ERROR !!!!
    	
//    	5		 
//	    Double avg = em.createQuery("SELECT avg(c.sellPrice) FROM Car c", Double.class).getSingleResult();
//	    System.out.println(avg);
    	
//    	6
//    	Car car = em.createQuery("SELECT c FROM Car c JOIN c.carSeller cs WHERE cs.id = :id", Car.class)
//    			.setParameter("id", new Long(5)).getSingleResult();
//    	System.out.println(car);
    	
//    	7
//    	BigDecimal sum = em
//    			 .createQuery("SELECT sum(c.sellPrice) FROM Car c WHERE c.id BETWEEN :first AND :last", BigDecimal.class)
//    			 .setParameter("first", new Long(1))
//    			 .setParameter("last", new Long(6))
//    			 .getSingleResult();
//    			 System.out.println(sum);
    	
//    	8
//    	List<CarSeller> cs = em.createQuery("SELECT cs FROM CarSeller cs WHERE id IN(:ids)", CarSeller.class)
//    			 .setParameter("ids", Arrays.asList(new Long(2), new Long(5), new Long(10), new Long(9)))
//    			 .getResultList();
//    	cs.forEach(c -> System.out.println(c));
    	
//    	9
//    	List<CarSeller> cars  = em.createQuery("SELECT c FROM CarSeller c WHERE c.phoneNumber LIKE '3%' AND c.id > 5", CarSeller.class)
//    			 .getResultList();
//     	cars.forEach(c -> System.out.println(c));
    	
//    	10
//    	Car car = em.createQuery("SELECT c FROM Car c WHERE c.carMake = :carMake", Car.class)
//    	        .setParameter("carMake", new Long(5))
//    			.getSingleResult();
//    	System.out.println(car);             !!!!! ERROR !!!!
    			 		 
//    	!!!!!!!!!!!!!!!
    	
    	
//    	!!!!! QUERY Criteria !!!!!!
    	
    	CriteriaBuilder cb = em.getCriteriaBuilder();
    	
    	CriteriaQuery<Car> query = cb.createQuery(Car.class);
    	Root<Car> root = query.from(Car.class);
    	query.select(root);
    	
//    	1
//    	List<Car> cars = em.createQuery(query).getResultList();
//    	cars.forEach(c -> System.out.println(c));
    	
//      2
//    	Expression<BigDecimal> priceExppression = root.get("sellPrice"); 
//    	Predicate pricePredicate1 = cb.ge(priceExppression, new BigDecimal(100.0));
//    	Predicate pricePredicate2 = cb.le(priceExppression, new BigDecimal(500.0));
//    	
//    	Predicate allPredicates = cb.and(pricePredicate1, pricePredicate2); 
//    	query.where(allPredicates);
    	
//    	3
//    	Expression<Long> betweenId = root.get("id");
// 		Predicate predicateId = cb.between(betweenId, new Long(4), new Long(7));
// 		query.where(predicateId);
    	

//    	CriteriaQuery<CarMake> query = cb.createQuery(CarMake.class);
//    	Root<CarMake> root = query.from(CarMake.class);
//    	query.select(root);

//    	4
//    	Expression<String> titleExpression = root.get("makeTitle");
// 		Predicate titlePredicate = cb.like(titleExpression, "%DO%");
// 		query.where(titlePredicate);
    	
//    	5
//    	Expression<Long> idExpressionLong = root.get("id");
// 		Predicate idExpressionPredicate = cb.ge(idExpressionLong, new Long(6));	
// 		Predicate allLikePredicates = cb.and(titlePredicate, idExpressionPredicate);
// 		query.where(allLikePredicates);
 		
// 		6
 		Join<Car, CarMake> carjoin = root.join("carMake");
 		Expression<Long> carIdJoin = carjoin.get("id"); 
 		Predicate carIdPredicate = cb.equal(carIdJoin, new Long(5));
//
 		query.where(carIdPredicate);
    	
//    	7
    	root.fetch("carMake");
 		query.distinct(true);
    	
    	List<Car> carm = em.createQuery(query).getResultList();
    	carm.forEach(c -> System.out.println(c));
    	
//    	!!!!!!!!!!!!!!!
    	
    	em.getTransaction().commit();
    	
    	em.close();
    	factory.close();
    
    	
    	
    }
}
