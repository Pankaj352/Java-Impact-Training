
import java.util.Scanner;
import java.util.Stack;

public class LargestRectangleInHistogram {
    
    static int largestRectangleArea(int n, int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int i = 0;

        while (i < n) {
            if (stack.isEmpty() || heights[i] >= heights[stack.peek()]) {
                stack.push(i);
                i++;
            } else {
                int top = stack.pop();
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, heights[top] * width);
            }
        }

        while (!stack.isEmpty()) {
            int top = stack.pop();
            int width = stack.isEmpty() ? i : i - stack.peek() - 1;
            maxArea = Math.max(maxArea, heights[top] * width);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of test cases: ");
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            System.out.print("Enter the number of histogram bars: ");
            int n = scanner.nextInt();
            int[] heights = new int[n];

            System.out.println("Enter the heights of bars:");
            for (int i = 0; i < n; i++) {
                heights[i] = scanner.nextInt();
            }

            int result = largestRectangleArea(n, heights);
            System.out.println("Largest Rectangle Area: " + result);
        }

        scanner.close();
    }
}