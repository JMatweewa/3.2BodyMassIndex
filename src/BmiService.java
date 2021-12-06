public class BmiService {
    public double calculate(double bodyWeightKg, double heightM) {

        double bodyMassIndex = bodyWeightKg / (heightM * heightM);
        return bodyMassIndex;
    }

}
