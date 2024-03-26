abstract class Beverages {

	// Defined
	public void addMilk() {
		System.out.println("Adding Milk");
	}

	// abstract
	abstract void addIngredients();
}

class Coffee extends Beverages
{
	void addIngredients()
	{
		System.out.println("Adding Coffe Beans");
	}
	// addMilk inherited
}
class Tea extends Beverages
{
	void addIngredients()
	{
		System.out.println("Adding chai Masala");
	}
	// addMilk inherited
}
class FruitJuice extends Beverages
{
	void addIngredients()
	{
		System.out.println("Adding Mango");
	}
	// addMilk inherited
}

//create Array of Beverages class and store all the child classes objects.
//now traverse the array and invoke all the functions.
public class BeveragesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverages[] beverage=new Beverages[3];
		beverage[0]=new Coffee();
		beverage[1]=new Tea();
		beverage[2]=new FruitJuice();
		
		for(int i=0;i<beverage.length;i++) {
			beverage[i].addMilk();
			beverage[i].addIngredients();
		}

	}

}
