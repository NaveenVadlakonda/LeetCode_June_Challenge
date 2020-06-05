class Solution {
    public void reverseString(char[] s) {
       int n=s.length;
        for(int i=0;i<s.length/2;i++){
            swap(s,i,n-i-1);
        }
        
    }
    public void swap(char[] s,int i,int j){
        char temp;
        temp=s[i];
        s[i]=s[j];
        s[j]=temp;
    }
        
}