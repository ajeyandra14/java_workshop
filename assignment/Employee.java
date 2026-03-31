public record Employee(int id,int salary) {


    public Employee{
        if(salary<=0){
            throw new UnsupportedOperationException("Salary cannot be less than equal to 0");
        }

    }

    boolean isHighEarner(int salary){
        return salary> 100000 ? true : false;
    }

}
