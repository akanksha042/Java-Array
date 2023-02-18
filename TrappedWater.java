//mast question hai...
//Time Complexity = O(n)
//Space Complexity = O(n)

public class TrappedWater {

    public static int TrappedRainWater(int height[]){
        //calculate leftmost boundary
        int n = height.length;
        int leftMax [] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n;i++){
            leftMax [i] = Math.max(height[i], leftMax[i - 1] );
        }
        //calculate rightmost boundary
        int rightMAx [] = new int[n];
        rightMAx[n-1] = height[n-1];
        rightMAx[n-1] = height[n-1];
        //i = n-2 se shuru karenge kyu n-1 ke already calculate ho chuki hai value
        for(int i=n-2; i>=0;i--){
            rightMAx [i] = Math.max(height[i], rightMAx[i + 1] );
        }
        
        int trappedWater = 0;
        //loop
        for(int i=0;i<n;i++){
            //waterlevel = min(leftmost,rightmost)
            int waterLevel = Math.min(leftMax[i], rightMAx[i]);
            //tarppedwater = waterlevel - height[i]
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
        
        



    }

    public static void main(String args[]){

        int height[] = {4,2,0,6,3,2,5};
        //TrappedRainWater(height);
        System.out.println(TrappedRainWater(height));
        

    }
    
}
