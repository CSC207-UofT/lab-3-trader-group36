public class Thing implements Tradable, Drivable {
    private int speed;

    public Thing() {
        this.speed = 11;
    }

    @Override
    public void upgradeSpeed() {
        this.speed += 9;
    }

    @Override
    public void downgradeSpeed() {
        if (this.speed < 10) {
            this.speed = 0;
        }
        if (this.speed == 10) {
            this.speed = 0;
        } else {
            this.speed -= 10;
        }
    }

    @Override
    public int getMaxSpeed() {
        return this.speed;
    }

    @Override
    public int getPrice() {
        return 12345;
    }

    @Override
    public String toString() {
        return "A Thing with speed " + this.speed + " that costs 12345.";
    }
}
