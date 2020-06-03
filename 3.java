class Solution {
  public int twoCitySchedCost(int[][] costs) {      
     Arrays.sort(costs, (a,b)-> a[0]-a[1]-(b[0]-b[1]));
      int n=costs.length/2,s=0;
      for(int i=0;i<n;i++){
          s+=costs[i][0]+costs[i+n][1];
      }
	  return s;
      /*
    // Sort by a gain which company has 
    // by sending a person to city A and not to city B
    Arrays.sort(costs, new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        return o1[0] - o1[1] - (o2[0] - o2[1]);
      }
    });

    int total = 0;
    int n = costs.length / 2;
    // To optimize the company expenses,
    // send the first n persons to the city A
    // and the others to the city B
    for (int i = 0; i < n; ++i) total += costs[i][0] + costs[i + n][1];*/
    
  }
}