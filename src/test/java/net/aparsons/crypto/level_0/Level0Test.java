package net.aparsons.crypto.level_0;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Level0Test {
    
    @Parameters
    public static List<String[]> data() {
        return Arrays.asList(new String[][] { 
            {"BackendCompleteStartup", "BackendCompleteStartup"},
            {"MashupSustainabilityHadoop", "MashupSustainabilityHadoop"},
            {"BlogMonitoringHardware", "BlogMonitoringHardware"}
        });
    }
    
    private static Level0 level0 = new Level0();
    
    private final String input;
    private final String expResult;
    
    public Level0Test(String input, String expResult) {
        this.input = input;
        this.expResult = expResult;
    }
    
    /**
     * Test of solve method, of class Level0.
     */
    @Test
    public void testSolve() {
        String result = level0.solve(input);
        
        System.out.printf("Level 0 - %s >> %s\n", input, result);
        
        assertEquals(expResult, result);
    }
    
}
