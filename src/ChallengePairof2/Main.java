package ChallengePairof2;

public class Main {
    public static void main(String args[])
    {
        int[] arr = { 1, 5, 7, -1, -5, -5 };
        int sum = 0;
        getPairsCount(arr, sum);
    }

    public static void getPairsCount(int[] arr, int sum)
    {
        int count = 0;

        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if ((arr[i] + arr[j]) == sum)
                    count++;

        System.out.printf("Count of pairs is %d", count);
    }

}
