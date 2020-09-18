class forloopLabel
{
    public static void main(String[] args) {
        
        outer:
        for(int i=0; i< 5 ;i++)
        {
            for(int j=0 ; j<5 ; j++)
            {
                System.out.println(" "+j);
                if(j==3)
                break outer;
            }
            System.out.println("");
        }   

    }

}