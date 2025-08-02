class Recursion 
{
	public static void main(String[] args) 
	{
		/*int method = method(12);
		System.out.println(method);
	}
		public static int method(int a){
		if(a==1||a==2){
			return 1;
			}
			return method(a-1)+method(a-2);
		}*/
		/*int[] arr={5,4,3,2,1};
		for(int j=0;j<arr.length-1;j++){
			for(int i=0;i<arr.length-1-j;i++){
				if(arr[i]>arr[i+1]){
		int temp=arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
		}*/

		int[] arr={1,2,3,4,5,6,7,8,9,10};
		int index = binary(arr,7);
		System.out.println(index);
}

public static int binary(int[] arr,int data){
        int min=0;
        int mid=0;
        int max=arr.length-1;
        while (min<=max){
            mid=(min+max)/2;
            if (data<arr[mid]){
                max=mid-1;
            }else if (data>arr[mid]){
                min=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }

}
