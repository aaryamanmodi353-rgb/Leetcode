class Solution {
    public int[][] merge(int[][] intervals) {

       Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

       List<int[]> lst = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        
        

        int i = 0;
        for(i = 1; i < intervals.length; i++){

            int startnew = intervals[i][0];
            int endnew = intervals[i][1];

            if(end >= startnew){

                start= start;
                end = Math.max(end, endnew);
                continue;

            }

            lst.add(new int[]{start, end});

            start = startnew;
            end = endnew;
            
        }

        lst.add(new int[]{start, end});

        return lst.toArray(new int[lst.size()][2]);
        
    }
}