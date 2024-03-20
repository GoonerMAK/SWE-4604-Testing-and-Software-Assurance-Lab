import static org.junit.Assert.*;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeTest {

    @Test
    public void testGetCurrentTime() {
        DateTime dateTime = new DateTime();
        String expectedDateFormat = new SimpleDateFormat("dd/MM/yyyy").format(new Date(dateTime.getTime()));
        assertEquals(expectedDateFormat, dateTime.getFormattedDate());
    }

    @Test
    public void testGetFormattedDate() {
        DateTime dateTime = new DateTime(15, 3, 2024);
        assertEquals("15/03/2024", dateTime.getFormattedDate());
    }

    @Test
    public void testDiffDays() {
        DateTime startDate = new DateTime(10, 3, 2024);
        DateTime endDate = new DateTime(20, 3, 2024);
        assertEquals(10, DateTime.diffDays(endDate, startDate));
    }

    @Test
    public void testGetEightDigitDate() {
        DateTime dateTime = new DateTime(25, 3, 2024);
        assertEquals("25032024", dateTime.getEightDigitDate());
    }

    @Test
    public void testGetNameOfDay() {
        DateTime dateTime = new DateTime(25, 3, 2024);
        assertEquals("Monday", dateTime.getNameOfDay());
    }

    @Test
    public void testDefaultConstructor() {
        long currentTime = System.currentTimeMillis();
        DateTime dateTime = new DateTime();
        assertTrue(dateTime.getTime() >= currentTime);
    }

}
