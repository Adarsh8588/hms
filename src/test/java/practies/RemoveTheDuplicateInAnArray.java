package practies;

public class RemoveTheDuplicateInAnArray 
{
 public static void main(String[] args) 
	{  
int[] a= {1,1,2,2,3,4,4,5,5,6};
int size=a.length;
for(int i=0;i<size;i++)
{
	for(int j=i+1;j<size;j++)
	{
		if(a[i]==a[j])
		{
			a[j]=a[size-1];
			size--;
		}
	}
}
	for(int i=0;i<size;i++)
	{
		System.out.println(a[i]);
	}
	}	
}
