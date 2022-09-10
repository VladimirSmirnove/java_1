
public class program {

    static int routes  (int start, int end, int com1, int com2) {
        int[] ways = new int[end + 1];
        ways[start] = 1;
        for (int index = start + 1; index <= end; index++) {
            if (index % com2 == 0) {
                ways[index] = ways[index - com1] + ways[index / com2];
            } else {
                ways[index] = ways[index - com1];
            }
        }
            return ways[end];
        }
        public static void main(String[] args) {
            System.out.println(routes(2,6, 2, 2));
        }
    }
