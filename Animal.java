 class Animal{ 
    private String name;

    public Animal(String name){
        this.name = name;
 
 
}

    public void speak() {
        System.out.println(name + " makes a sound.");
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}


class Dog extends Animal {
    public Dog(String name) {
        super(name); // Call the superclass constructor
    }

    public void speak() {
        System.out.println( " barks!");
    }

    public void fetch() {
        System.out.println( "is fetching a ball.");
    }
  
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal");
        Dog dog = new Dog("Buddy");

        // Call methods on the objects
        animal.speak(); // Output: Generic Animal makes a sound.
        animal.eat();   // Output: Generic Animal is eating.

        dog.speak();     // Output: Buddy barks!
        dog.eat();       // Output: Buddy is eating.
        dog.fetch();     // Output: Buddy is fetching a ball.

    }

    } 
