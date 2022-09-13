class Solution {
    public int[] constructRectangle(int area) {
        int[] result = new int[2];
        for(double i = Math.ceil(Math.sqrt(area)); i>0; i--) {
            if((area/i) % 1 == 0) {
                if(i > (area/i)) {
                    result =  new int[]{(int) i, (int) (area/i)};
                    break;
                }
                result = new int[]{(int) (area/i), (int) i};
                break;
            }
        }
        return result;
    }
}