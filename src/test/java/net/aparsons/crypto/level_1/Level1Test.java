package net.aparsons.crypto.level_1;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class Level1Test {
    
    @Parameterized.Parameters
    public static List<String[]> data() {
        return Arrays.asList(new String[][] { 
            {"FkclojxqflkprmboefdetxvObpmlkpfsbIldfpqfzp", ""},
            {"AxqxpzfbkzbObafpClohba", ""}
        });
    }
    
    private static Level1 level1 = new Level1();
    
    private final String input;
    private final String expResult;

    public Level1Test(String input, String expResult) {
        this.input = input;
        this.expResult = expResult;
    }
    
    /**
     * Test of solve method, of class Level1.
     */
    @Test
    public void testSolve() {
        String result = level1.solve(input);
        
        System.out.printf("Level 1 - %s >> %s\n", input, result);
        
        assertEquals(expResult, result);
    }
    
}
