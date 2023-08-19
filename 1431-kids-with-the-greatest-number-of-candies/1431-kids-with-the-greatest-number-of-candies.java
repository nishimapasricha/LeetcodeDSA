class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxcandies=Integer.MIN_VALUE;
        List<Boolean> result=new ArrayList<>();
        for(int i:candies){
            maxcandies=Math.max(maxcandies,i);
        }
//System.out.println(maxcandies);
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=maxcandies){
                result.add(i,true);
                 //System.out.println("here");
            }
            else{
               // System.out.println("there");  
            result.add(i,false);
            }
        }
        return result;
        
    }
}