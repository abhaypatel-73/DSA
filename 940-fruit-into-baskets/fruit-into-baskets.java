class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int low=0;
        int max=0;
        Map<Integer, Integer> freq = new HashMap<>();
        for(int high=0; high<n; high++){
            freq.put(fruits[high], freq.getOrDefault(fruits[high],0)+1);
            while(freq.size()>2){
                int lowFruits=fruits[low];
                freq.put(lowFruits, freq.get(lowFruits)-1);
                if(freq.get(lowFruits)==0){
                    freq.remove(lowFruits);
                   
                }
                 low++;
                
            }
            int len = high-low+1;
                max = Math.max(max,len);
        }
        return max;
    }
}