package baekjoon.b_15649;

import java.util.Scanner;

public class Main
{
    private static int N = 0;
    private static int M = 0;
    private static boolean[] lookupTable = { false, false, false, false, false, false, false, false, false };
    private static int[] answer = { -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1 <= M <= N <= 8
        N = scanner.nextInt();
        M = scanner.nextInt();

        recv(0);
    }

    private static void recv(int idx)
    {
        if (idx >= M)
        {
            for (int i = 0; i < M; ++i)
            {
                System.out.print(answer[i]);
                if (i == M - 1)
                {
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        else
        {
            for (int num = 1; num <= N; ++num)
            {
                if (lookupTable[num] == false)
                {
                    lookupTable[num] = true;
                    answer[idx] = num;
                    recv(idx + 1);
                    lookupTable[num] = false;
                }
            }
        }
    }
}
