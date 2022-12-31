class Dog {
    int size;
    String breed;
    String name;

    void bark() {
        System.out.println("Woof! Woof!");
    }
}

class DogTestDrive {
    public static void main(String[] args) {
        // Dog test code goes here
        Dog d = new Dog();
        d.size = 40;
        d.bark();
    }
}

