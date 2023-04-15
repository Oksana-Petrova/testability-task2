public class BmiService {
    public int calculate(double heightMetre, double weightKg) {
        double bmi = weightKg / (heightMetre * heightMetre); //ИМТ = m (кг) / (h (м))^2
        return (int) bmi;
    }
}