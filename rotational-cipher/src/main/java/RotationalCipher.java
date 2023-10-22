class RotationalCipher {

    private int shiftKey;

    private final String ABC_upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String ABC_lower = "abcdefghijklmnopqrstuvwxyz";
    
    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(String data) {
        String rotation = "";
        String ABC = "";

        for (Character c : data.toCharArray()) {
            int overhead = 0, pos = 0;

            ABC = Character.isUpperCase(c) ? ABC_upper : ABC_lower;

            if (ABC.indexOf(c) == -1) {
                rotation += c;
                continue;
            }

            overhead = ABC.indexOf(c) + shiftKey;
            pos =  (overhead >= 26) ? overhead - 26 : overhead;

            rotation += ABC.charAt(pos);
        }

        return rotation;
    }

}
