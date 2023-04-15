public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightMetre = 1.70;
        double weightKg = 58;
        int bmi = service.calculate(heightMetre, weightKg);
        System.out.println("Индекс массы тела при росте " + heightMetre + " м и весе " + weightKg + " кг составляет " + bmi);
    }
}