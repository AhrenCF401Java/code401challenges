package code401challenges.stacksandqueues;

public class AnimalShelter {
    Queue dogQ;
    Queue catQ;

    public AnimalShelter() {
        dogQ = new Queue();
        catQ = new Queue();
    }

    public void enQ(String animal) throws IllegalArgumentException {
        animal = animal.toUpperCase();
        if(animal.equals("DOG")){
            dogQ.enqueue(1);
        }
        if(animal.equals("CAT")){
            catQ.enqueue(0);
        }
        else {
            throw new IllegalArgumentException("Please enter Cat or Dog");
        }
    }

    public void dQ(String animal) throws IllegalArgumentException {
        animal = animal.toUpperCase();
        if(animal.equals("DOG")) {
            if(dogQ.peek() != null) {
                dogQ.dequeue();
            }
        }
        if (animal.equals("CAT")){
            if(catQ.peek() != null){
                catQ.dequeue();
            }
        }
        else{
            throw new IllegalArgumentException("Please enter Cat or Dog");
        }
    }
}
