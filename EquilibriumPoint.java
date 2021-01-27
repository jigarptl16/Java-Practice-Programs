import java.util.Arrays;
/**
* Given an array A of N positive numbers. The task is to find the first Equilibium Point in the array. 
* Equilibrium Point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.
*
* @param  arr  input array
* @param  n size of array
* @return      int equilibrium point
* @author  Jigar
*/
public class EquilibriumPoint
{
    public static void main(String[] args)
    {
	long A[] = { 1, 3, 5, 2, 2 };
	int n = 5;
	System.out.println(equilibriumPoint(A, n));// Time limit exceed
	System.out.println(findEquilibriumPoint(A, n));// accepted
    }

    public static int findEquilibriumPoint(long arr[], int n)
    {
	int sum = (int) Arrays.stream(arr).sum();
	int leftSum = 0;
	for (int i = 0; i < n; i++)
	{
	    sum = (int) (sum - arr[i]);
	    if (leftSum == sum)
	    {
		return i + 1;
	    }
	    leftSum += arr[i];
	}

	return 0;
    }
    @Deprecated
    public static int equilibriumPoint(long arr[], int n)
    {
	if (n <= 1)
	{
	    return 1;
	}
	for (int i = 1; i < n - 1; i++)
	{
	    if (sumBefore(i, arr) == sumAfter(i, n, arr))
	    {
		return i + 1;
	    }
	}
	return -1;
    }

    private static int sumBefore(int index, long arr[])
    {
	int leftSum = 0;
	for (int i = 0; i < index; i++)
	{
	    leftSum += arr[i];
	}
	return leftSum;
    }

    private static int sumAfter(int index, int n, long arr[])
    {
	int rightSum = 0;
	for (int i = index + 1; i < n; i++)
	{
	    rightSum += arr[i];
	}
	return rightSum;
    }
}
