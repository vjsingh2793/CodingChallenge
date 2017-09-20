class RotateArray 
{
    /*Function to left rotate arr[] of size n by d*/
    void leftRotate(int arr[], int d, int n) 
    {
        int i;
        for (i = 0; i < d; i++)
            leftRotatebyOne(arr, n);
    }
    void rightRotate(int arr[],int d,int n)
    {
	int i;
	for(i=0; i< d; i++)
	  rightRotatebyOne(arr, n);
    }
    void rightRotatebyOne(int arr[], int n)
    {
	int i,temp;
        temp=arr[n-1];
        for(i=n-1; i > 0; i--)
	  arr[i]=arr[i-1];
        arr[0]=temp;
    }
    void leftRotatebyOne(int arr[], int n) 
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
    }
 
    /* utility function to print an array */
    void printArray(int arr[], int size) 
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
 
    // Driver program to test above functions
    public static void main(String[] args) 
    {
        RotateArray rotate = new RotateArray();
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
	System.out.println("Right Rotation");
	rotate.rightRotate(arr,2,7);
	rotate.printArray(arr,7);
	System.out.println("Left Rotation");
        rotate.leftRotate(arr, 2, 7);
        rotate.printArray(arr, 7);
    }
}