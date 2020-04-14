import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestRishiShah{

    @Test
    public void testing_getFullName(){
        assertEquals("Rishi Shah", rs.getFullName(), "Ya done goofed!");
    }
    @Test
    public void testing_getFirstName(){
        assertEquals("Rishi", rs.getFirstName(), "Ya done goofed!");
    }
    @Test
    public void testing_getLastName(){
        assertEquals("Shah", rs.getLastName(), "Ya done goofed!");
    }
    @Test
    public void testing_getFullName(){
        assertEquals("rishiss", rs.getUCInetID(), "Ya done goofed!");
    }
    @Test
    public void testing_getFullName(){
        assertEquals(12474679, rs.getStudentNumber(), "Ya done goofed!");
    }
    @Test
    public void testing_getRotatedFullName(){
        assertEquals(" ShahRishi", rs.getRotatedFullName(5), "Ya done goofed!");
        assertEquals("ShahRishi ", rs.getRotatedFullName(-4), "Ya done goofed!");
    }
}