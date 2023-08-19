class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int prev=0;
        int next=0;
        if(flowerbed.length>1){
            next=flowerbed[1];
        }
        for(int i=0;i<flowerbed.length && n>0;i++){
            if(flowerbed[i]==0){
                if(prev ==0 && next==0)
                {
                    //System.out.println(i);
                    flowerbed[i]=1;
                    n--;
                }
            }
            prev=flowerbed[i];
            if(i+2<flowerbed.length)
                next=flowerbed[i+2];
            else
                next=0;
            // System.out.println("prev = "+prev+"  next = "+next);
        }
         //System.out.println("n= "+n);
        return n<=0?true:false;
    }
}