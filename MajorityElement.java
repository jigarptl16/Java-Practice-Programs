import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElement
{

    public static void main(String[] args)
    {
	int array[] = { 3, 1, 3, 3, 2 };
	System.out.println(majorityElement(array, array.length));
    }

    private static int majorityElement(int a[], int size)
    {
	Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
	for (int i = 0; i < a.length; i++)
	{
	    if (hashMap.containsKey(a[i]))
	    {
		int oldCount = hashMap.get(a[i]);
		hashMap.put(a[i], ++oldCount);
	    } else
	    {
		hashMap.put(a[i], 1);
	    }
	}
	int count = 0;
	int key = 0;
	for (Entry<Integer, Integer> entry : hashMap.entrySet())
	{
	    if (entry.getValue() > count)
	    {
		count = entry.getValue();
		key = entry.getKey();
	    }
	}
	if (count > size / 2)
	{
	    return key;
	}
	return -1;
    }

}
