public class OrientationTask1_5 {
    public static void main(String[] args) {
        ServicePoint servicePoint = new ServicePoint();
        CustomerGenerator generator = new CustomerGenerator();

        generator.generate(servicePoint, 5);
        servicePoint.serve();
    }
}