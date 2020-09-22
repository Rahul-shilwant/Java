class OneBHK{


    // roomArea, hallArea and price
    
    double roomArea;
     double hallArea;
     double price;

    OneBHK(){

    this.roomArea = 5;
    this.hallArea =  10;
    this.price = 150;

    }
    OneBHK(double roomArea , double hallArea ,double price)
    {
        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price = price;
    
    }

    void show()
    {
        System.out.println(roomArea+" "+hallArea+" "+price);
    }


}

class TwoBHK extends OneBHK
{
    double room2Area;
     static double totalflat;

    TwoBHK()
    {
        this.roomArea = 15;
        this.hallArea = 25;
        this.price = 250;
        this.room2Area = 350;
        this.totalflat = 0;
    }

    TwoBHK(double room2Area ,double hallArea , double roomArea , double price )
    {
        this.room2Area = room2Area;
        this.hallArea = hallArea;
        this.roomArea = room2Area;
        this.price = price;
        
        totalflat += price; 

    }

    void show()
    {
            System.out.println(room2Area+" sqft room2Area \n "+roomArea+" sqft RoomArea \n"+hallArea+" sqft HallArea \n"+price+" rs price");
    }

    void totalflat()
    {
        totalflat = totalflat + price;
        System.out.println(" "+ totalflat);

    }

}

class SayDemo{

    public static void main(String[] args) {
        
        System.out.println("Enter 1st 2bhk flat info :");
        TwoBHK tb = new TwoBHK(200,150,300,5000);
        tb.show();
        
        
   System.out.println("Enter 2nd 2bhk flat info :");
        TwoBHK tb1 = new TwoBHK(400,250,400,50000);
        tb1.show();
        
        
   System.out.println("Enter 3rd 2bhk flat info :");
        TwoBHK tb2 = new TwoBHK(500,350,500,55000);
        tb2.show();
        
        System.out.println("Total flat price :");
        tb2.totalflat();

    }


}