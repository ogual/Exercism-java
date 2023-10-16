public class FootballMatchReports {    
    public static String onField(int shirtNum) {
        String playerDesc = "";

        switch (shirtNum) {
            case 1: playerDesc = "goalie"; break;
            case 2: playerDesc = "left back"; break;
            case 3:
            case 4: playerDesc = "center back"; break;
            case 5: playerDesc = "right back"; break;
            case 6:
            case 7: 
            case 8: playerDesc = "midfielder"; break;
            case 9: playerDesc = "left wing"; break;
            case 10: playerDesc = "striker"; break;
            case 11: playerDesc = "right wing"; break;
            default: throw new IllegalArgumentException();
        }

        return playerDesc;
    }
}
