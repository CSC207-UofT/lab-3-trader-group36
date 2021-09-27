/* A sample class that implements the given interfaces.
 */
public class Lamb implements Domesticatable, Drivable, Tradable {
    private int maxSpeed;

    public Lamb() {
        this.maxSpeed = 1;
    }

    @Override
    public String sound() {
        return "Woc!";
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
        return 250;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
