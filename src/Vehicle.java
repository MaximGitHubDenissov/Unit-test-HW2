abstract class Vehicle {
    protected String company;
    protected String model;
    protected int yearRelease;
    protected int numWheels;
    protected int speed;

    protected void testDrive() {
        this.speed = 0;
    }

    protected void park() {
        this.speed = -1;
    }
    @Override
    public String toString(){
        return String.format("Компания: %s\nМодель: %s\nГод выпуска %d\nКоличество колес: %d\n",
                this.company, this.model, this.yearRelease, this.numWheels);

    }


}
