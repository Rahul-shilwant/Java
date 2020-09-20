class array{
    public static void main(String[] args) {
            int a[] = {1 ,2,3};
            int b[] = {1 ,2,3,4,5,6};
            int c[] = {1 ,2,3};
    
        int arr[][] =  new int[3][];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
    
        for(int arr2[] : arr)
        {
            for(int x : arr2)
            {
                System.out.print(" "+x);
            }
            System.out.println("");
        }
    
    
    
    }

}