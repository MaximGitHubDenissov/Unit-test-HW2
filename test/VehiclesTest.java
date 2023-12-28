import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class VehiclesTest {
    Car car = new Car();
    Motorcycle moto = new Motorcycle();

    @Test
    public void carIsInstanceOfVehicle(){
        assertThat(car).isInstanceOf(Vehicle.class);
    }
    @Test
    public void carHasFourWheels (){
        assertThat(car.numWheels).isEqualTo(4);
    }
    @Test
    public void motoHasTwoWheels (){
        assertThat(moto.numWheels).isEqualTo(2);
    }
    @Test
    public void carTestDriveIsCorrect(){
        car.testDrive();
        assertThat(car.speed).isEqualTo(60);
    }
    @Test
    public void motoTestDriveIsCorrect(){
        moto.testDrive();
        assertThat(moto.speed).isEqualTo(75);
    }
    @Test
    public void carParkingIsCorrect(){
        car.testDrive();
        car.park();
        assertThat(car.speed).isEqualTo(0);
    }
    @Test
    public void motoParkingIsCorrect(){
        moto.testDrive();
        moto.park();
        assertThat(moto.speed).isEqualTo(0);
    }

}
