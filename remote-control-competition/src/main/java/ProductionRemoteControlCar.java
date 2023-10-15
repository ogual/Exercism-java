class ProductionRemoteControlCar 
    implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    
    int distance = 0;
    int victories = 0;

    public void drive() {
        distance += 10;
    }

    public int getDistanceTravelled() {
        return distance;
    }

    public int getNumberOfVictories() {
        return victories;
    }   

    public void setNumberOfVictories(int numberOfVictories) {
        victories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar prcc) {
        if (this.victories > prcc.victories) {
            return -1;
        } else if (this.victories < prcc.victories) {
            return 1;
        } else {
            return 0;
        }
    }

    
}
