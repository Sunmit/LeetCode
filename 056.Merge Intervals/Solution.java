/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> res = new ArrayList<>();
        Collections.sort(intervals,new Comparator<Interval>(){
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start-o2.start;
            }
        });
        for(Interval interval:intervals){
            if(res.size()==0){
                res.add(interval);
                continue;
            }
            Interval lastInterval = res.get(res.size()-1);
            if(lastInterval.end>=interval.end){
                continue;
            }else if(lastInterval.end>=interval.start){
                lastInterval.end=interval.end;
            }else{
                res.add(interval);
            }
            
        }
        return res;  
    }
}
