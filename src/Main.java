public class Main {
    public static void main(String[] args) {
        Worker[] company = new Worker[100];
        int count = 0;

        company[count] = new Worker("Firdaws EZZAOUIA", 10000, 300);
        count++;

        company[count] = new Worker("Pedro SANCHEZ", 2600.58, 400);
        count++;

        company[count] = new Worker("Julien DUPONT", 1800, 200);
        count++;

        double globalTotal = 0;

        System.out.println("=== List of Workers ===");
        for (int i = 0; i < count; i++) {
            System.out.println(company[i].getName() + " - Base salary : " + company[i].getBaseSalary() + " - Complement : " + company[i].getComplement() + " - Total Salary : " + company[i].getTotalSalary());
            globalTotal += company[i].getTotalSalary();
        }

        System.out.println("-----------------------");
        System.out.println("Global Total Salary of the company : " + globalTotal);
    }
}

// Additional questions :
// - Yes, the design is ready. Thanks to encapsulation, the salary calculation is isolated
// inside the getTotalSalary() method of the Worker class. If we need to take taxes into
// account, we only need to update the formula inside this method, without changing any
// code in the Main class or wherever workers are processed.
//
// - We can keep a fixed array of size 100 (new Worker[100]) and maintain a counter variable
// (e.g., int count = 0) to track the actual number of workers added. Each time a worker is
// added, we increment the counter. When displaying the workers or calculating the global
// total salary, the loop only iterates up to count instead of the full array length.

// I am truly sorry for the late submission. Java is fairly new to me, so it took me a bit
// longer than expected to wrap my head around the concepts and finish the exercise properly.
//Thank you for your understanding and patience!
//Best,
// Firdaws