package baekjoon.b_1475;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String roomNumber = scanner.nextLine();

        int[] lookupTable = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        setLookUpTableByRoomNumber(lookupTable, roomNumber);
        int result = getMaxNumber(lookupTable);
        System.out.println(result);
    }

    private static void setLookUpTableByRoomNumber(int[] lookUpTable, String roomNumber)
    {
        for (int index = 0; index < roomNumber.length(); ++index)
        {
            int number = (roomNumber.charAt(index) - '0');
            if (number == 6)
            {
                if (lookUpTable[number] > lookUpTable[9])
                {
                    ++lookUpTable[9];
                    continue;
                }
            }
            else if (number == 9)
            {
                if (lookUpTable[number] > lookUpTable[6])
                {
                    ++lookUpTable[6];
                    continue;
                }
            }
            ++lookUpTable[number];
        }
    }

    private static int getMaxNumber(int[] lookupTable)
    {
        int maxNumber = 0;
        for (int index = 0; index < lookupTable.length; ++index)
        {
            if (maxNumber < lookupTable[index])
            {
                maxNumber = lookupTable[index];
            }
        }
        return maxNumber;
    }
}
