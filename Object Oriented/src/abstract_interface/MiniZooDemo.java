package abstract_interface;

abstract class Animal {
	private int leg;
	public Animal(int leg) {
		this.leg = leg;
	}
	public void sleep() {
		String name = getClass().getSimpleName();
		System.out.println(name + " is sleeping.");
	}
	public abstract String eat();
}

class Cat extends Animal {
	public Cat(int leg) {
		super(leg);
	}
	@Override
	public String eat() {
		return "milk";
	}
}

class Dear extends Animal {
	public Dear(int leg) {
		super(leg);
	}
	@Override
	public String eat() {
		return "grass";
	}
}

class Lion extends Animal {
	public Lion(int leg) {
		super(leg);
	}
	@Override
	public String eat() {
		return "meat";
	}
}

class MiniZoo {
	Animal[] animal;
	public MiniZoo(Animal[] animal) {
		this.animal = animal;
	}
	public void show() {
		for(Animal ani : animal) {
			ani.sleep();
			String diets = ani.eat();
			String name = ani.getClass().getSimpleName();
			System.out.println(name + " eats " + diets);
		}
	}
}

class MiniZooDemo {
	
	public static void main(String[] args) {
		Animal[] animal = new Animal[3];
		animal[0] = new Cat(4);
		animal[1] = new Dear(4);
		animal[2] = new Lion(4);

		MiniZoo demo = new MiniZoo(animal);
		demo.show();
	}
	
}


