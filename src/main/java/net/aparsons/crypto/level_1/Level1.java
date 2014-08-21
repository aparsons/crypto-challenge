package net.aparsons.crypto.level_1;

import net.aparsons.crypto.Challenge;

/**
 * The solution is a 23 character caesar cipher
 */
public class Level1 implements Challenge {

    @Override
    public String getHint() {
        return "Praetorian... that sounds Roman...";
    }

    @Override
    public String solve(String value) {
        return decode(value, 23);
    }
    
    private String decode(String enc, int offset) {
        return encode(enc, -offset);
    }
    
    private String encode(String enc, int offset) {
        offset = offset % 26 + 26;
        StringBuilder encoded = new StringBuilder();
        for (char i : enc.toLowerCase().toCharArray()) {
            if (Character.isLetter(i)) {
                int j = (i - 'a' + offset) % 26;
                encoded.append((char) (j + 'a'));
            } else {
                encoded.append(i);
            }
        }
        return encoded.toString();
    }

}
