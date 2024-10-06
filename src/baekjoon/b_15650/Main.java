package baekjoon.b_15650;

import java.util.Scanner;

public class Main
{
    private static int N;
    private static int M;
    private static int[] answer = { 0, 0, 0, 0, 0, 0, 0, 0 };
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();

        recursion(0, 1);
    }

    private static void recursion(int answerIdx, int startNumber)
    {
        if (answerIdx >= M)
        {
            for (int i = 0; i < M; ++i)
            {
                System.out.print(answer[i]);
                if (i != M - 1)
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        else
        {
            for (int num = startNumber; num <= N; ++num)
            {
                answer[answerIdx] = num;
                recursion(answerIdx + 1, num + 1);
            }
        }
    }
}
