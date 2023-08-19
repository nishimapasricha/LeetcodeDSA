class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int min=Math.min(n,m);
        String s="";
        int flag=0;
        int k=0;
        while(k<min){
            if(flag==0){
                s=s+word1.charAt(k);
                flag=1;
            }
            else{
               s=s+word2.charAt(k);
                 flag=0;
                k++;
            }
        }
        if(n!=min){
            for(int i=min;i<n;i++){
                s=s+word1.charAt(i); 
            }
        }
        else{
             for(int i=min;i<m;i++){
                s=s+word2.charAt(i); 
            }
        }
        return s;
    }
}