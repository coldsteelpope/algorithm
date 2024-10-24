package baekjoon.b_1439;


import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str += '2';

        int[] numbers = { 0, 0, 0 };
        boolean isSame = true;
        char currentNumber = str.charAt(0);

        for (int i = 0; i < str.length(); ++i)
        {
            if (currentNumber != str.charAt(i))
            {
                if (str.charAt(i) != '2')
                {
                    isSame = false;
                }
                ++numbers[currentNumber - '0'];
                currentNumber = str.charAt(i);
            }
        }

        if (isSame)
        {
            System.out.println(0);
        }
        else
        {
            if (numbers[0] == 0)
            {
                System.out.println(numbers[1]);
            }
            else if (numbers[1] == 0)
            {
                System.out.println(numbers[0]);
            }
            else
            {
                int result = numbers[0] > numbers[1] ? numbers[1] : numbers[0];
                System.out.println(result);
            }
        }
    }
}
