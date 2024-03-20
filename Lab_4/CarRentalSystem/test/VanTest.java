import org.junit.Test;
import static org.junit.Assert.*;

public class VanTest {

    @Test
    public void testGetLateFee() {
        Van van = new Van("V_001", 2022, "Vapid", "Speedo", 0, new VehicleType(7));
        assertEquals(1495.0, van.getLateFee(new DateTime(20, 3, 2024), new DateTime(15, 3, 2024)), 0.01);
    }

    @Test
    public void testReturnVehicleSuccess() {
        Van van = new Van("V_002", 2021, "Vapid", "Speedo", 1, new VehicleType(8));
        van.records = new RentalRecord[10];
        van.records[0] = new RentalRecord("R_001", new DateTime(15, 3, 2024), new DateTime(20, 3, 2024));
        assertTrue(van.returnVehicle(new DateTime(20, 3, 2024)));
    }

    @Test
    public void testCompleteMaintenanceSuccess() {
        Van van = new Van("V_004", 2020, "Vapid", "Speedo", 2, new VehicleType(10));
        assertTrue(van.completeMaintenance(new DateTime(20, 3, 2024)));
    }

    @Test
    public void testToString() {
        DateTime lastMaintenanceDate = new DateTime(1, 3, 2024);
        Van van = new Van("V_006", 2021, "Vapid", "Speedo", 0, new VehicleType(10, lastMaintenanceDate));
        assertEquals("V_006:2021:Vapid:Speedo:15:Available:01/03/2024", van.toString());
    }

    @Test
    public void testGetDetailsWithNonEmptyRentalRecord() {
        DateTime lastMaintenanceDate = new DateTime(10, 3, 2024);
        Van van = new Van("V_008", 2022, "Vapid", "Speedo", 0, new VehicleType(8, lastMaintenanceDate));
        van.records = new RentalRecord[10];
        van.records[0] = new RentalRecord("R_001", new DateTime(15, 3, 2024), new DateTime(20, 3, 2024));
        assertEquals("Vehicle ID:\tV_008\n Year:\t 2022\n Make:\tVapid\n Model:\tSpeedo\n Number of Seats:\t8\n Status:\tAvailable\nLast maintenance date:\t10/03/2024\nRENTAL RECORD:\nRecord ID:             R_001\nRent Date:             15/03/2024\nEstimated Return Date: 20/03/2024                     \n----------                     \n", van.getDetails());
    }

    @Test
    public void testGetDetailsWithNullRentalRecord() {
        DateTime lastMaintenanceDate = new DateTime(10, 3, 2024);
        Van van = new Van("V_009", 2021, "Vapid", "Speedo", 0, new VehicleType(7, lastMaintenanceDate));
        van.records = new RentalRecord[10];
        assertEquals("Vehicle ID:\tV_009\n Year:\t 2021\n Make:\tVapid\n Model:\tSpeedo\n Number of Seats:\t7\n Status:\tAvailable\nLast maintenance date:\t10/03/2024\nRENTAL RECORD:\tempty", van.getDetails());
    }


}
