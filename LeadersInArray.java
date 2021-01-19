import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArray
{

    public static void main(String[] args)
    {
	int A[] = { 63, 70, 80, 33, 33, 47, 20 };
	int n = 7;
	System.out.println(leaders(A, n));// Time limit exceed
	System.err.println(findLeaders(A, n));// accepted 

    }

    private static ArrayList<Integer> leaders(int arr[], int size)
    {
	List<Integer> list = new ArrayList<Integer>();
	for (int i = 0; i < size; i++)
	{
	    int j;
	    for (j = i + 1; j < size; j++)
	    {
		if (arr[i] < arr[j])
		    break;
	    }
	    if (j == size)
	    {
		list.add(arr[i]);
	    }
	}
	return (ArrayList<Integer>) list;
    }

    private static ArrayList<Integer> findLeaders(int arr[], int size)
    {
	ArrayList<Integer> list = new ArrayList<>();
	int max = 0;
	for (int i = size - 1; i >= 0; i--)
	{
	    if (arr[i] >= max)
	    {
		max = arr[i];
		list.add(arr[i]);
	    }
	}
	Collections.reverse(list);
	return list;

    }

}
