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