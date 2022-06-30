import ru.netology.sqr.dz6java.services.SQRService;

public class Main {
    public static void main(String[] args) {
        int min = 200;
       int max = 300;
        SQRService service = new SQRService();
        System.out.println(service.calcSQR(min, max));
    }
}
