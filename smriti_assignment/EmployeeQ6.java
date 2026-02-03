//Ques 6

record  EmployeeInfo(int id , double Salary){

public EmployeeInfo{
    if(Salary<=0){
        throw new IllegalArgumentException("the salary should be greater than 0");
    }
}
public Boolean isHighEarner(){
    return Salary>1000;
}
}

public class EmployeeQ6 {
    public static void main(String[] args){
        EmployeeInfo emp = new EmployeeInfo(101,12000);
        System.out.println("employee details"+emp);
        System.out.println("is a high earner ?"+ emp.isHighEarner());
    }
}

