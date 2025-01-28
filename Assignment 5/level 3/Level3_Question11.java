import java.util.Random;

public class Level3_Question11 {

    public static void main(String[] args) {
        double[][] employeeData = generateEmployeeData();
        double[][] updatedData = calculateBonusAndSalary(employeeData);
        calculateAndDisplayTotalAmount(employeeData, updatedData);
    }

    public static double[][] generateEmployeeData() {
        Random rand = new Random();
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            double salary = rand.nextInt(90000) + 10000;
            int yearsOfService = rand.nextInt(20);
            data[i][0] = salary;
            data[i][1] = yearsOfService;
        }
        return data;
    }

    public static double[][] calculateBonusAndSalary(double[][] data) {
        double[][] updatedData = new double[10][3];
        for (int i = 0; i < 10; i++) {
            double salary = data[i][0];
            int yearsOfService = (int) data[i][1];
            double bonus = 0;
            if (yearsOfService > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }
            double newSalary = salary + bonus;
            updatedData[i][0] = newSalary;
            updatedData[i][1] = bonus;
            updatedData[i][2] = salary;
        }
        return updatedData;
    }

    public static void calculateAndDisplayTotalAmount(double[][] oldData, double[][] newData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        System.out.println("Employee\tOld Salary\tBonus\tNew Salary");
        for (int i = 0; i < 10; i++) {
            totalOldSalary += oldData[i][0];
            totalNewSalary += newData[i][0];
            totalBonus += newData[i][1];
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\n", i+1, oldData[i][0], newData[i][1], newData[i][0]);
        }
        System.out.printf("\nTotal Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
        System.out.printf("Total Bonus Amount: %.2f\n", totalBonus);
    }
}
