import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    private static final byte DIGITS = 5;

    List<Signal> calculateHandshake(int number) {
        List<Signal> list = new ArrayList<>();
        
        String numBinary = Integer.toBinaryString(number);

        int length = numBinary.length();
        int lengthMax = length <= DIGITS ? length : DIGITS;

        for (int i = 0; i < lengthMax; i++) {

            if (numBinary.charAt(length - i -1) == '1') {
                if (i == 4) {
                    Collections.reverse(list);
                    break;
                } else {
                    list.add(Signal.values()[i]);
                }
            }

        }

        return list;
    }

}
