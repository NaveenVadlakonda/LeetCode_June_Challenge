class RandomizedSet {
    //Set<Integer> s;
    Map<Integer,Integer> m;
    List<Integer> l;
    Random r=new Random();
    /** Initialize your data structure here. */
    public RandomizedSet() {
        //1.s=new HashSet<Integer>();
      m=new HashMap<>();
      l=new ArrayList<>();
        
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        // if(!s.contains(val)){
        //     s.add(val);
        //     return true;}
        // else
        //     return false;
        if(m.containsKey(val)) return false;
        
            m.put(val,l.size());
            l.add(l.size(),val);
            return true;
        
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!m.containsKey(val)) return false;
        int ind=m.get(val);
        
        int nk=l.get(l.size()-1);
        l.set(ind,nk);
        m.put(nk,ind);
        m.remove(val);
        l.remove(l.size()-1);
        return true;
        
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        //if(l.size()>0){
        return l.get(r.nextInt(l.size()));
        // List l = new ArrayList(s);
        // Random r=new Random();
        // return (int)l.get(r.nextInt(l.size()));        
        // }
        // return -1;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */