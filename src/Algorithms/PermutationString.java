
package Algorithms;

public class PermutationString {
	/**
     * permutation function
     * @param str string to calculate permutation for
     * @param l starting index
     * @param r end index
     */
private void permute(String str, int l, int r)
{
	if(l==r)
		System.out.println(str);
	else
	{
		for(int i=l; i<=r; i++)
		{
			str = swap(str, i, l);
			permute(str, 1+l, r);
			str = swap(str, i, l);
		}
	}

}
/**
 * Swap Characters at position
 * @param a string value
 * @param i position 1
 * @param j position 2
 * @return swapped string
 */
public String swap(String a, int i, int j)
{
	char temp;
	//Converts the string to a character array.
	char[] charArray = a.toCharArray();
	temp = charArray[i];
	charArray[i] = charArray[j];
	charArray[j] = temp;
	return String.valueOf(charArray);	
}

public static void main(String[] args)
{
	String str = "ABC";
	int n = str.length();
	PermutationString obj = new PermutationString();
	obj.permute(str, 0, n-1);
}
}
