import java.util.Scanner;
class Employee{
	private int empId;
	private String empName;
	void set(int empId,String empName){
		this.empId = empId;
		this.empName = empName;
	}
	void show(){
		System.out.println(empId+" "+empName);
	}
}
class this1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Employee ar[] = new Employee[3];
		for(int i=0;i<ar.length;i++){
			System.out.println("Enter id");	
			int empId = sc.nextInt();
			System.out.println("Enter name");
			String empName = sc.next();
			
			Employee e = new Employee();
			e.set(empId,empName);
			ar[i] = e;
		}
		// for(Employee a : ar){	
		// 	a.show();
		// }
		for(int i = 0 ; i< ar.length ; i++)
		{
			Employee a = new Employee();
			a = ar[i];
			a.show();
		}
		
		System.out.println("==========");
		ar[1].show();
	}
}