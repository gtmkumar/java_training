public class Teacher extends Person {
    private String Department;
    public String Specialization;

    public String GetDepartment() {
        return Department;
    }

    public void SetDepartment(String department) {
        Department = department;
    }

    public String GetSpecialization() {
        return Specialization;
    }

    public void SetSpecialization(String specialization) {
        Specialization = specialization;
    }

    public Teacher(String name, int age, String department, String specialization) {
        super(name, age);
        Department = department;
        Specialization = specialization;
    }
}
