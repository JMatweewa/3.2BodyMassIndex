public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyMassIndex = service.calculate(65, 1.71);
        System.out.println("Ваш индекс массы тела " + (String.format("%.2f", bodyMassIndex)));
    }
}
