class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int maxK = piles[0];
        for (int pile : piles) {
            maxK = Math.max(maxK, pile);
        }

        // if ((maxK / (maxK / piles.length)) == h) {
        //     return maxK / piles.length;
        // }

        int head = 1;
        int tail = maxK;
        
        int minK = tail;
        int hourTest;
        while (head <= tail) {
            int totalHour = 0;
            int mid = (head + tail) / 2;

            for (int pile : piles) {
                int hour = (int) Math.ceil((double) pile / mid);
                totalHour += hour;
            }
            
            if (totalHour > h) {
                    head = mid + 1;
                } else {
                    tail = mid - 1;
                    minK = Math.min(minK, mid);
                    hourTest = totalHour;
                    System.out.print("Hour: " + hourTest);
            }
        }
            // if (totalHour <= h) {
            //     minK = Math.min(minK, mid);
            //     tail = mid - 1;
            // } else {
            //     head = mid + 1;
            // }

        return minK;
    }
}
