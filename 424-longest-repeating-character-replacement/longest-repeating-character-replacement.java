class Solution {
     private int find(Map<Character, Integer> freq) {
        int max = 0;

        for (int count : freq.values()) {
            max = Math.max(max, count);
        }

        return max;
    }
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> freq = new HashMap<>();
        int low =0, res=Integer.MIN_VALUE;
        int arr[]= new int[255];
        int n=s.length();
        for(int high=0; high<n; high++){
            char ch=s.charAt(high);
            freq.put(ch, freq.getOrDefault(ch,0)+1);
            int len = high-low+1;
            int maxCount=find(freq);
            int diff=len-maxCount;
            while(diff > k){
                char lowChar = s.charAt(low);
                freq.put(lowChar, freq.get(lowChar)-1);
                low++;
                maxCount = find(freq);
                len=high-low+1;
                diff = len-maxCount;
            }
            len = high-low+1;
            res = Math.max(res, len);
        }
        return res;
    }
    
}