package baekjoon.b_1992;

import java.util.Scanner;

public class Main
{
    private static int N;
    private static int[][] board;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        board = new int[N][N];
        fillBoard(scanner);
        dfs(0, 0, N);
    }

    private static void dfs(int startRow, int startCol, int size)
    {
        boolean isSameSquare = isSame(startRow, startCol, size);
        boolean isSizeOne = size == 1;

        if (isSameSquare || isSizeOne)
        {
            System.out.print(board[startRow][startCol]);
        }
        else
        {
            int halfSize = size / 2;

            System.out.print("(");
            dfs(startRow, startCol, halfSize);
            dfs(startRow, startCol + halfSize, halfSize);
            dfs(startRow + halfSize, startCol, halfSize);
            dfs(startRow + halfSize, startCol + halfSize, halfSize);
            System.out.print(")");
        }
    }

    private static boolean isSame(int startRow, int startCol, int size)
    {
        int initElement = board[startRow][startCol];
        for (int i = startRow; i < startRow + size; ++i)
        {
            for (int j = startCol; j < startCol + size; ++j)
            {
                if (initElement != board[i][j])
                {
                    return false;
                }
            }
        }
        return true;
    }

    private static void fillBoard(Scanner scanner)
    {
        for (int i = 0; i < N; ++i)
        {
            String row = scanner.next();
            for (int j = 0; j < N; ++j)
            {
                board[i][j] = Integer.valueOf(row.charAt(j) - '0');
            }
        }
    }

    private static void printBoard(int startRow, int endRow, int startCol, int endCol)
    {
        for (int i = startRow; i < endRow; ++i)
        {
            for (int j = startCol; j < endCol; ++j)
            {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

}
