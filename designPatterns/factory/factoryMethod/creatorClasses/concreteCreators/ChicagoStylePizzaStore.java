package designPatterns.factory.factoryMethod.creatorClasses.concreteCreators;

import designPatterns.factory.abstractFactory.concreteFactories.ChicagoPizzaIngredientFactory;
import designPatterns.factory.factoryMethod.creatorClasses.abstractCreator.PizzaStore;
import designPatterns.factory.factoryMethod.productClasses.abstractProduct.Pizza;
import designPatterns.factory.factoryMethod.productClasses.concreteProducts.CheesePizza;
import designPatterns.factory.factoryMethod.productClasses.concreteProducts.ClamPizza;
import designPatterns.factory.factoryMethod.productClasses.concreteProducts.PepperoniPizza;
import designPatterns.factory.factoryMethod.productClasses.concreteProducts.VeggiePizza;


public class ChicagoStylePizzaStore extends PizzaStore {

	
	@Override
	protected Pizza createPizza(String item) {
		
		Pizza pizza = null;
		
		ChicagoPizzaIngredientFactory chicagoPizzaIngredientFactory =
				new ChicagoPizzaIngredientFactory();
		
		if (item.equals("cheese")) {
			pizza = new CheesePizza(chicagoPizzaIngredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");
			
		} else if (item.equals("veggie")) {
			pizza = new VeggiePizza(chicagoPizzaIngredientFactory);
			pizza.setName("Chicago Style Veggie Pizza");
			
		} else if (item.equals("clam")) {
			pizza = new ClamPizza(chicagoPizzaIngredientFactory);
			pizza.setName("Chicago style clam pizza");
			
		} else if (item.equals("pepperoni")) {
			pizza = new PepperoniPizza(chicagoPizzaIngredientFactory);
			pizza.setName("Chicago Style Pepperoni Pizza");
			
		} 
		
		return pizza;
	}

}
