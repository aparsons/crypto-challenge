package net.aparsons.crypto.level_0;

import net.aparsons.crypto.Challenge;

/**
 * The solution is the same value as the challenge text.
 */
public class Level0 implements Challenge {
    
    @Override
    public String getHint() {
        return "The password is staring right at you...";
    }
    
    @Override
    public String solve(String value) {
        return value;
    }
    
}
