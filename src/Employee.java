public class Employee { /* Создал базовый класс с закрытыми полями геттерами, сеттерами и конструктором*/
    private String name;
    private String department;
    private int pukpuk;

    public Employee(String name, String department, int pukpuk) {
        this.name = name;
        this.department = department;
        this.pukpuk = pukpuk;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getPukpuk() {
        return pukpuk;
    }

    public void setPukpuk(int pukpuk) {
        this.pukpuk = pukpuk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
