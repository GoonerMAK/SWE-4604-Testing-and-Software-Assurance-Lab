import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {

    @Test
    public void testLateFeeCalculationWithPositiveDays() {
        Car car = new Car("C_001", 2022, "Karin", "Kurama", 0, new VehicleType(5));
        DateTime startDate = new DateTime(10, 3, 2024);
        DateTime endDate = new DateTime(15, 3, 2024);
        assertEquals(487.5, car.getLateFee(endDate, startDate), 0.01);
    }

    @Test
    public void testLateFeeCalculationWithZeroDays() {
        Car car = new Car("C_002", 2022, "Karin", "Kurama", 0, new VehicleType(5));
        DateTime startDate = new DateTime(10, 3, 2024);
        assertEquals(0.0, car.getLateFee(startDate, startDate), 0.01);
    }

    @Test
    public void testReturnVehicleSuccess() {
        Car car = new Car("C_003", 2022, "Karin", "Kurama", 1, new VehicleType(5));

        car.records = new RentalRecord[10];
        car.records[0] = new RentalRecord("R_001", new DateTime(15, 3, 2024), new DateTime(20, 3, 2024));

        assertFalse(car.returnVehicle(new DateTime(15, 3, 2024)));
    }

    @Test
    public void testReturnVehicleFailure() {
        Car car = new Car("C_004", 2022, "Karin", "Kurama", 0, new VehicleType(5));
        assertFalse(car.returnVehicle(new DateTime(15, 3, 2024)));
    }

    @Test
    public void testCompleteMaintenanceSuccess() {
        Car car = new Car("C_005", 2022, "Karin", "Kurama", 2, new VehicleType(5));
        assertTrue(car.completeMaintenance());
    }

    @Test
    public void testCompleteMaintenanceFailure() {
        Car car = new Car("C_006", 2022, "Karin", "Kurama", 0, new VehicleType(5));
        assertFalse(car.completeMaintenance());
    }

    @Test
    public void testGetDetailsWithEmptyRentalRecord() {
        Car car = new Car("C_007", 2022, "Karin", "Kurama", 0, new VehicleType(5));
        assertEquals("Vehicle ID:\tC_007\n Year:\t 2022\n Make:\tKarin\n Model:\tKurama\n Number of Seats:\t5\n Status:\tAvailable\nRENTAL RECORD:\tempty", car.getDetails());
    }

    @Test
    public void testGetDetailsWithNonEmptyRentalRecord() {
        Car car = new Car("C_008", 2022, "Karin", "Kurama", 0, new VehicleType(5));
        car.returnVehicle(new DateTime(15, 3, 2024));
        assertEquals("Vehicle ID:\tC_008\n Year:\t 2022\n Make:\tKarin\n Model:\tKurama\n Number of Seats:\t5\n Status:\tAvailable\nRENTAL RECORD:\tempty", car.getDetails());
    }

    @Test
    public void testGetDetailsWithNullRecordsElement() {
        Car car = new Car("C_010", 2022, "Karin", "Kurama", 0, new VehicleType(5));
        car.records[0] = null;
        assertEquals("Vehicle ID:\tC_010\n Year:\t 2022\n Make:\tKarin\n Model:\tKurama\n Number of Seats:\t5\n Status:\tAvailable\nRENTAL RECORD:\tempty", car.getDetails());
    }
}
