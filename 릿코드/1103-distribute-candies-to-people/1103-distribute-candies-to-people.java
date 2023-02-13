class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];
        int count = 0, giveCandy = 1;
        while(candies > 0) {
            if(count >= num_people) count = 0;
            if(giveCandy > candies) giveCandy = candies;
            result[count++] += giveCandy;
            candies -= giveCandy++;
        }
        return result;
    }
}