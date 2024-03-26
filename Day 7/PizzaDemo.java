interface PizzaIngredientFactory
{
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Pepperoni createPepperoni();
	public Clams createClams();
}
class Dough{
	Dough(String mess){
		System.out.println("Creating "+ mess+" Dough");
	}
}
class Sauce{
	Sauce(String mess){
		System.out.println("Creating "+ mess+" Sauce");
	}
}
class Cheese{
	Cheese(String mess){
		System.out.println("Creating "+ mess+" Cheese");
	}
}
class Pepperoni{
	Pepperoni(String mess){
		System.out.println("Creating "+ mess+" Pepperoni");
	}
}
class Clams{
	Clams(String mess){
		System.out.println("Creating "+ mess+" Clams");
	}
}

class USPizzaIngredientFactory implements PizzaIngredientFactory{
	public Dough createDough() {
		return new Dough("US");
	}
	public Sauce createSauce() {
		return new Sauce("US");
	}
	public Cheese createCheese() {
		return new Cheese("US");
	}
	public Pepperoni createPepperoni() {
		return new Pepperoni("US");
	}
	public Clams createClams() {
		return new Clams("US");
	}
}

class IndianPizzaIngredientFactory implements PizzaIngredientFactory{
	public Dough createDough() {
		return new Dough("Indian");
	}
	public Sauce createSauce() {
		return new Sauce("Indian");
	}
	public Cheese createCheese() {
		return new Cheese("Indian");
	}
	public Pepperoni createPepperoni() {
		return new Pepperoni("Indian");
	}
	public Clams createClams() {
		return new Clams("Indian");
	}
}
public class PizzaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PizzaIngredientFactory[] p=new PizzaIngredientFactory[2];
		p[0]=new USPizzaIngredientFactory();
		p[1]=new IndianPizzaIngredientFactory();
		
		for(int i=0;i<p.length;i++) {
			p[i].createDough();
			p[i].createSauce();
			p[i].createCheese();
			p[i].createPepperoni();
			p[i].createClams();	
		}
	}

}
