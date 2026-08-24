class weekly2_6 {
    public int largestAltitude(int[] gain) {

        int altitude = 0;
        int highest = 0;

        for (int i = 0; i < gain.length; i++) {
            altitude = altitude + gain[i];

            highest = Math.max(highest, altitude);
        }

        return highest;
    }
}
