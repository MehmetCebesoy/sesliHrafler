public class Main {

    public static void main(String[] args) {
        // write your code here
        String harf = "İ";
        String a = harf.toLowerCase();
        String h = a;


        switch (h) {

            case "a":
                System.out.println("Kalın sesli harf");
                break;
            case "ı":
                System.out.println("Kalın sesli harf");
                break;
            case "o":
                System.out.println("Kalın sesli harf");
                break;
            case "u":
                System.out.println("Kalın sesli harf");
                break;
            case "e":
                System.out.println("İnce sesli harf");
                break;
            case "i":
                System.out.println("İnce sesli harf");
                break;
            case "ö":
                System.out.println("İnce sesli harf");
                break;
            case "ü":
                System.out.println("İnce sesli harf");
                break;
            default:
                System.out.println("Yanlış harf girdiniz");
        }

    }
}
