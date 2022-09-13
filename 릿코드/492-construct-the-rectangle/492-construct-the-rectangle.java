class Solution {
    public int[] constructRectangle(int area) {
        int[] result = new int[2];
        for(double i = Math.ceil(Math.sqrt(area)); i>0; i--) {
            if((area/i) % 1 == 0) {
                if(i > (area/i)) {
                    return  new int[]{(int) i, (int) (area/i)};
                    
                }
                return new int[]{(int) (area/i), (int) i};
                
            }
        }
        return new int[]{0, 0};
    }
}