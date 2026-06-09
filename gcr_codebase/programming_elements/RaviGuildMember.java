package gcr_codebase.programming_elements;

public class RaviGuildMember {
    public static void main(String[] args) {

        String name = "Ravi";
        int age = 22;
        String rank = "Member";
        double salary = 50000;
        float membershipFee = 1500.50f;

        double bonus = salary * 0.12;
        int annualBonus = (int) bonus;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Rank: " + rank);
        System.out.println("Salary: " + salary);
        System.out.println("Membership Fee: " + membershipFee);
        System.out.println("Annual Bonus: " + annualBonus);
    }
}
