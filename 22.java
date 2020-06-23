class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i:nums){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }
            else{
                hm.put(i,1);
            }
        }
        int a=1;
        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
           if(e.getValue().equals(1))
             a =e.getKey(); 
           
       }
      
      return a;  
    
    }
}