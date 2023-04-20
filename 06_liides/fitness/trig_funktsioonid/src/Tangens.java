public class Tangens extends TaisnurkneKolmnurk implements Nurgad{

    public Tangens(double kylgA, double kylgB, double kylgC) {
        super(kylgA, kylgB, kylgC);
    }

    @Override
    public double leiaKaatetiteSuhe() {
        return kylgA/kylgB;
    }
    @Override
    public double leiaNurk() {
        return (double)Math.round(Math.toDegrees(Math.atan(leiaKaatetiteSuhe())) * 100d) / 100d;
    }
}
