import java.util.*;
class Faculty{
	int salary;
	int fid;
	
	void input(int fid){
		this.fid=fid;
	}
	void showSalary(){
		System.out.println("Salary is = "+salary);
	}
}

class FullTimeFaculty extends Faculty{
	int basicSal;
	int allowance;
	
	void input(int fid,int basicSal,int allowance){
		super.input(fid);
		this.basicSal=basicSal;
		this.allowance=allowance;
		this.salary=basicSal+allowance;
	}
}

class PartTimeFaculty extends Faculty{
	int workingHours;
	int ratePerHour;
	void input(int fid,int workingHours,int ratePerHour){
		super.input(fid);
		this.workingHours=workingHours;
		this.ratePerHour=ratePerHour;
		this.salary=workingHours+ratePerHour;
	}
}

class prog44{
	public static void main(String[] args){
		FullTimeFaculty f = new FullTimeFaculty();
		f.input(1,25000,5000);
		f.showSalary();
		
		PartTimeFaculty p = new PartTimeFaculty();
		p.input(2,10000,2000);
		p.showSalary();
	}
}