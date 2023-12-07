import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class MergeIntervel {
    public static class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }

    public static ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        intervals.add(newInterval);
        Collections.sort(intervals, Comparator.comparingInt(a -> a.start));

        ArrayList<Interval> result = new ArrayList<>();
        result.add(intervals.get(0));

        for (int i = 1; i < intervals.size(); i++) {
            Interval lastIntervalInResult = result.get(result.size() - 1);
            Interval currentInterval = intervals.get(i);

            if (currentInterval.start <= lastIntervalInResult.end) {
                lastIntervalInResult.end = Math.max(lastIntervalInResult.end, currentInterval.end);
            } else {
                result.add(currentInterval);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Interval> intervals = new ArrayList<>();

        intervals.add(new Interval(1, 2));
        intervals.add(new Interval(3, 5));
        intervals.add(new Interval(6, 7));
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(12, 16));

        Interval interval = new Interval(4, 9);

        ArrayList<Interval> ans = new ArrayList<>();
        ans = insert(intervals, interval);

        for (Interval i : ans) {
            System.out.println(i.start + " " + i.end);
        }
    }
}
