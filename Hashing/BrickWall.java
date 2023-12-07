import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BrickWall {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxCount = 0;

        for (List<Integer> row : wall) {
            int sum = 0;
            for (int i = 0; i < row.size() - 1; i++) { // avoid counting the last brick
                sum += row.get(i);
                map.put(sum, map.getOrDefault(sum, 0) + 1); // count the number of bricks at each position
                maxCount = Math.max(maxCount, map.get(sum)); // update the max count
            }
        }

        return wall.size() - maxCount;
    }

    public static void main(String[] args) {
        BrickWall bw = new BrickWall();
        List<List<Integer>> wall = List.of(
                List.of(1, 2, 2, 1),
                List.of(3, 1, 2),
                List.of(1, 3, 2),
                List.of(2, 4),
                List.of(3, 1, 2),
                List.of(1, 3, 1, 1));
        System.out.println(bw.leastBricks(wall));
    }
}
