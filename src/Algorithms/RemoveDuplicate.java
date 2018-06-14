
package Algorithms;

public class RemoveDuplicate {
public static int[] remove(int[] input)
{
	int i=1;
	int j=0;
	if(input.length<2)
		return input;
	while(i<input.length)
	{
		if(input[i]==input[j])
		{
			i++;
		}
		else
		{
			input[++j]=input[i++];
		}
	}
	int[] output = new int[j+1];
	for(int k=0; k<output.length; k++)
	{
		output[k]=input[k];
	}
	return output;
}
public static void main(String[] args){
int[] input = {2, 2, 3, 4, 5, 5, 6, 6, 7, 8, 8, 12, 12};
int[] output = remove(input);
for(int i : output)
	System.out.print(i+" ");

}
}
