package net.aparsons.crypto;

public interface Challenge {

    public String getHint();
    
    public String solve(String value);
    
}
