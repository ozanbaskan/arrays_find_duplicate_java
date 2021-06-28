import java.util.Arrays;

public class Main
{
    static boolean isHas(int[] list, int num)
    {
        for (int i : list)
        {
            if (i == num)
            {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args)
    {
        int[] list = {32, 123, 32, 34, 31, 1, 2, 5, 33, 1, 4, 123, 34};
        int[] duplicate = new int[list.length];
        int index = 0;
        for (int i = 0; i < list.length; i++)
        {
            for (int j = 0; j < list.length; j++)
            {
                if ((i != j) && (list[i] == list[j]))
                {
                    if (!isHas(duplicate, list[i]))
                    {
                        duplicate[index++] = list[i];
                    }
                    break;
                }
            }
        }
        System.out.print("Duplicates: ");
        for (int i : duplicate)
        {
            if (i != 0)
            {
                System.out.print(i + ", ");
            }
        }
    }
}