class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> lst = new ArrayList<>();

        int n = intervals.length;

        int i = 0;
        
        while(i < n && intervals[i][1] < newInterval[0]){

            lst.add(intervals[i]);
            i++;
            
        }

        while(i < n && intervals[i][0] <= newInterval[1]){

            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;

        }

        lst.add(newInterval);


        while(i < n){

            lst.add(intervals[i]);
            i++;


        }
        
        return lst.toArray(new int[lst.size()][2]);
        
    }
}