public class Car extends Vehicle{
    public Car(){
        numWheels = 4;
        speed = 0;
    }

    @Override
    protected void testDrive() {
        this.speed = 60;
    }

    @Override
    protected void park() {
        this.speed = 0;
    }
}
