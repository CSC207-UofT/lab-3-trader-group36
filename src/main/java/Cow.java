public class Cow implements Domesticatable, Tradable, Drivable{

    private int maxSpeed;
    private int milkproduction;

    public Cow(int milk){
        this.maxSpeed = 2;
        this.milkproduction = milk;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 50;
    }

    @Override
    public String sound() {
        return "Mou!";
    }

    public int getMilkProduction() {
        return this.milkproduction;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
