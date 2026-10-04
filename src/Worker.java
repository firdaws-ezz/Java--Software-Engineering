public class Worker {

    private String name;
    private double baseSalary;
    private double complement;

    public Worker (String name, double baseSalary, double complement){
        this.name = name;
        this.baseSalary = baseSalary;
        this.complement = complement;
    }
    public String getName() {
        return this.name;
    }

    public double getBaseSalary() {
        return this.baseSalary;
    }

    public double getComplement() {
        return this.complement;
    }

    public double getTotalSalary() {
        return this.baseSalary + this.complement;
    }
}

