import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return Arrays.copyOfRange(birdsPerDay, birdsPerDay.length-7, birdsPerDay.length);
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
        getToday();
    }

    public boolean hasDayWithoutBirds() {
        return Arrays.binarySearch(birdsPerDay, 0) >= 0;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        
        if (numberOfDays > birdsPerDay.length)
            numberOfDays = birdsPerDay.length;

        for (int i = 0; i < numberOfDays; i++) {
            count += birdsPerDay[i];
        }

        return count;
    }

    public int getBusyDays() {
        int count = 0;
        
        for(int birds: birdsPerDay) {
            if (birds >= 5)
                count++;
        }
        
        return count;
    }
}
