public class Siinus extends TaisnurkneKolmnurk implements Nurgad{
    public Siinus(double kylgA, double kylgB, double kylgC) {
        super(kylgA, kylgB, kylgC);
    }

    @Override
    public double leiaKaatetiteSuhe() {
        return kylgA/kylgC;
    }
    @Override
    public double leiaNurk() {
        return (double)Math.round(Math.toDegrees(Math.asin(leiaKaatetiteSuhe())) * 100d) / 100d;
    }
}
