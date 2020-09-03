package inheritance;

/**
 * @ClassName:Manager
 * @Description:a manager
 * @Author: liuanhai
 * @Date 2020/7/22 0022
 * @Version 1.0
 */
public class Manager extends Employee {
    private double bonus;
    public Manager(String name, double salary, int year, int month, int day){
        super(name, salary, year, month, day);
        bonus = 0;
    }

    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
