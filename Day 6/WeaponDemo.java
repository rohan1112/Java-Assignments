
class Weapon {
	public void attack() {
	}
}

class Sword extends Weapon {
	public void attack() {
		System.out.println("Attacking with Sword");
	}
}

class Bomb extends Weapon {
	public void attack() {
		System.out.println("Attacking with Bomb");
	}
}

class Gun extends Weapon {
	public void attack() {
		System.out.println("Attacking with Gun");
	}

	public void fillBullets() {
		System.out.println("filling bullets");
	}
}

class Soldier {
	// define "fight" method in such a way that given any specific weapon, it should
	// be able to attack
	public void fight(Weapon ref) {
		ref.attack();
		// make sure you invoke "fillBullets" also along with "attack" and that
		// shouldn't give "ClassCastException"
		if (ref instanceof Gun) {
			((Gun) ref).fillBullets();
		}
	}

}

public class WeaponDemo {
	public static void main(String[] args) {

		// invoke "fight" method of Soldier class
		Soldier s1 = new Soldier();
		s1.fight(new Gun());
	}

	{
	}
}
