public class ElonsToyCar {
    private int distance = 0;
    private byte battery = 100;
    
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", distance);
    }

    public String batteryDisplay() {
        return "Battery " + ((battery > 0) ? 
            String.format("at %d", battery) + "%" : "empty");
    }

    public void drive() {
        if (battery > 0) {
            distance += 20;
            battery -= 1;
        }
    }
}
