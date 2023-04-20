public class Koosinus extends TaisnurkneKolmnurk implements Nurgad{
    public Koosinus(double kylgA, double kylgB, double kylgC) {
        super(kylgA, kylgB, kylgC);
    }

    @Override
    public double leiaKaatetiteSuhe() {
        return kylgB/kylgC;
    }
    @Override
    public double leiaNurk() {
        return (double)Math.round(Math.toDegrees(Math.acos(leiaKaatetiteSuhe())) * 100d) / 100d;
    }
}
