public class Main {
    public static void main(String[] args) {
        Siinus sin1 = new Siinus(3,4,5);
        System.out.println(sin1.leiaKaatetiteSuhe());
        System.out.println(sin1.leiaNurk());
        Koosinus cos1 = new Koosinus(3, 9, 12);
        System.out.println(cos1.leiaKaatetiteSuhe());
        System.out.println(cos1.leiaNurk());
        Tangens tan1 = new Tangens(7,4,9);
        System.out.println(tan1.leiaKaatetiteSuhe());
        System.out.println(tan1.leiaNurk());

    }
}