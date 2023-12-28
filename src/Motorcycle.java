public class Motorcycle extends Vehicle{
    public Motorcycle(){
        numWheels = 2;
        speed = 0;
    }

    @Override
    protected void testDrive() {
        this.speed = 75;
    }

    @Override
    protected void park() {
        this.speed = 0;
    }
}