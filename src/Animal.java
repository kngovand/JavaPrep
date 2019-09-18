public abstract class Animal implements Actions {

    private boolean isPredator;
    private boolean isWalking;
    private boolean isFlying;
    private String name;


    Animal(String name) {
        isPredator = false;
        isWalking = false;
        isFlying = false;
        this.name = name;

        if(name.equals("Tiger")) {
            isPredator = true;
            isWalking = true;
        }
        if(name.equals("Pigeon")) {
            isWalking = true;
            isFlying = true;
        }
        if(name.equals("Cat")) {
            isPredator = true;
            isWalking = true;
        }
    }
    @Override
    public void speak() {
        System.out.println("Animal speaking");
    }

    @Override
    public void walk() {
        System.out.println("Animal walking");

    }

    @Override
    public void fly() {
        System.out.println("Animal flying");

    }

    public String getName() {
        return this.name;
    }

    public boolean isPredator() {
        if(this.isPredator == true) {
            return true;
        }
        return false;
    }
    public boolean isFlying() {
        if(this.isFlying == true) {
            return true;
        }
        return false;
    }
    public boolean isWalking() {
        if(this.isWalking == true) {
            return true;
        }
        return false;
    }
}
