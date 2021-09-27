public class Boar implements Tradable, Domesticatable,Drivable{
    public int maxspeed;
    public Boar(){
        maxspeed = 10;
    }
    @Override
    public String sound() {
        return "ger";
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxspeed;
    }

    @Override
    public void downgradeSpeed() {
        this.maxspeed=1;
    }

    @Override
    public void upgradeSpeed() {
        this.maxspeed=10;
    }
}
