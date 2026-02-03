public record Employee(String id, Integer salary) {

    public Employee {
        if(salary<=0) throw new IllegalArgumentException("salary cant be negative");
    }

    public boolean isHighEarner(Integer salary){
        return salary > 10000;
    }

}
