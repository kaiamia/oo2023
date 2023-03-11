import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println(aritmeetilineKeskmine(4,7,2));
        double[] sisend = {3,4,5,6,7,8};
        System.out.println(Arrays.toString(libisevKeskmine(sisend)));
    }
    private static double aritmeetilineKeskmine(double arv1, double arv2, double arv3){
        return (arv1 + arv2 + arv3)/3;
    }

    //List numbriteList = new ArrayList(); --> manipuleeritav
    //numbriteList[] --> read-only
    private static double[] libisevKeskmine(double[] arvud){
        double[] valjund = new double[arvud.length - 2];
        for (int i = 0; i < arvud.length-2; i++) {
            valjund[i] = (arvud[i] + arvud[i+1] + arvud[i+2])/3;
        }
        return valjund;
    }

}