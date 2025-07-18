package JAVATASKS;

interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {
    public boolean feed(boolean timeToEat) {
        // put gorilla food into cage
        if (timeToEat) {
            System.out.println("Gorilla is eating its food.");
            return true;
        } else {
            System.out.println("It's not time for the gorilla to eat.");
            return false;
        }
    }

    public void groom() {
        // lather, rinse, repeat
        System.out.println("Grooming the gorilla.");
    }
    public void pet() {
        // pet at your own risk
        System.out.println("Attempting to pet the gorilla. Exercise caution!");
    }

public static void main(String[] args) {
        Gorilla myGorilla = new Gorilla();
        System.out.println();
        myGorilla.feed(true);  
        myGorilla.feed(false); 
        myGorilla.groom();     
        myGorilla.pet();    
    }
}

