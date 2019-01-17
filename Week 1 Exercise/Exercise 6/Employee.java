public class Employee {
private Integer idNumber;

public Employee(){}
    public Integer getIdNumber(){
        return idNumber;
    }

    public Employee(Integer idNumber){
        this.idNumber = idNumber;

}

    public boolean hasAdministratorRights() {
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj ==this){
            return true;
        }
        if(!(obj instanceof Employee)){
            return false;
        }
        Employee name = (Employee)obj;
    return this.idNumber==name.idNumber;

    //return super.equals(obj);
    }
}

