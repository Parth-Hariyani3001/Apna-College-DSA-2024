
public class StaticKeyword {

    public static void main(String args[]) {
        Employee p1 = new Employee();
        p1.companyName = "Amazon";
        Employee p2 = new Employee();
        System.out.println(p2.companyName);
    }
}

class Employee {

    String name;
    int roll;

    static String companyName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
