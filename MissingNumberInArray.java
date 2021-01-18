import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MissingNumberInArray
{

    public static void main(String[] args)
    {
	int array[] = { 1 };
	int n = 2;
	System.out.println(MissingNumber(array, n));
	System.out.println(getMissingNo(array, array.length));
    }

    private static int MissingNumber(int array[], int n)
    {
	int result = 0;
	List<Integer> lst = Arrays.stream(array).boxed().collect(Collectors.toList());
	for (int i = 0; i < n; i++)
	{
	    if (!lst.contains((i + 1)))
	    {
		result = i + 1;
	    }
	}
	return result;
    }

    static int getMissingNo(int a[], int n)
    {
	int i, total;
	total = (n + 1) * (n + 2) / 2;
	for (i = 0; i < n; i++)
	    total -= a[i];
	return total;
    }
}
