class Solution {
    public String reverseVowels(String s) {
        Set<Character> set=new HashSet<>();
        set.add('a');
         set.add('e');
         set.add('i');
         set.add('o');
         set.add('u');
         set.add('A');
         set.add('E');
         set.add('I');
         set.add('O');
         set.add('U');
        int length=s.length();
        int left=0;
        int right=length-1;
        while(left<right){
            if(set.contains(s.charAt(left))&& set.contains(s.charAt(right))){
               s=swap(s,left,right);
                left++;
                right--;
           }
           else if(set.contains(s.charAt(left))){
               right--;
           }
           else {
               left++;
           }
        }
        return s;
    }
    public String swap(String s,int left,int right){
        char c1=s.charAt(left);
        char c2=s.charAt(right);
        StringBuffer str=new StringBuffer(s);
        str.setCharAt(left,c2);
        str.setCharAt(right,c1);
        return str.toString();
    }
}