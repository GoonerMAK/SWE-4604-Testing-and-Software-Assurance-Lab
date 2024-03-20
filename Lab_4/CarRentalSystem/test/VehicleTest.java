import static org.junit.Assert.*;

import org.junit.Test;

public class VehicleTest {

    @Test
    public void testGetVehicleId() {
        Vehicle vehicle = new Vehicle("C_001", 2022, "Karin", "Kurama", 0, new VehicleType(5));
        assertEquals("C_001", vehicle.getVehicleId());
    }

    @Test
    public void testRentSuccess() {
        Vehicle vehicle = new Vehicle("C_002", 2022, "Karin", "Kurama", 0, new VehicleType(5));
        assertTrue(vehicle.rent("customer1", new DateTime(10, 3, 2024), 5));
    }

    @Test
    public void testRentFailure() {
        Vehicle vehicle = new Vehicle("C_003", 2022, "Karin", "Kurama", 0, new VehicleType(5));
        assertFalse(vehicle.rent("customer2", new DateTime(10, 3, 2024), 0));
    }

    @Test
    public void testPerformMaintenanceSuccess() {
        Vehicle vehicle = new Vehicle("V_001", 2022, "Vapid", "Speedo", 0, new VehicleType(7));
        assertTrue(vehicle.performMaintenance());
    }

    @Test
    public void testPerformMaintenanceFailure() {
        Vehicle vehicle = new Vehicle("V_001", 2022, "Vapid", "Speedo", 1, new VehicleType(7));
        assertFalse(vehicle.performMaintenance());
    }

    @Test
    public void testToStringCarAvailable() {
        Vehicle vehicle = new Vehicle("C_005", 2022, "Karin", "Kurama", 0, new VehicleType(5));
        assertEquals("C_005:2022:Karin:Kurama:5:Available", vehicle.toString());
    }

    @Test
    public void testToStringVanRented() {
        Vehicle vehicle = new Vehicle("V_002", 2022, "Vapid", "Speedo", 1, new VehicleType(10));
        assertEquals("V_002:2022:Vapid:Speedo:15:Rented", vehicle.toString());
    }

    @Test
    public void testGetDetailsCar() {
        Vehicle vehicle = new Vehicle("C_006", 2022, "Karin", "Kurama", 0, new VehicleType(5));
        assertEquals("Vehicle ID:\tC_006\n Year:\t 2022\n Make:\tKarin\n Model:\tKurama\n Number of Seats:\t5\n Status:\tAvailable", vehicle.getDetails());
    }

    @Test
    public void testGetDetailsVan() {
        Vehicle vehicle = new Vehicle("V_003", 2022, "Vapid", "Speedo", 1, new VehicleType(15));
        assertEquals("Vehicle ID:\tV_003\n Year:\t 2022\n Make:\tVapid\n Model:\tSpeedo\n Number of Seats:\t15\n Status:\tRented", vehicle.getDetails());
    }

    @Test
    public void testGetLastElementIndexEmptyRecords() {
        Vehicle vehicle = new Vehicle("C_007", 2022, "Karin", "Kurama", 0, new VehicleType(5));
        assertEquals(-1, vehicle.getLastElementIndex());
    }
}
