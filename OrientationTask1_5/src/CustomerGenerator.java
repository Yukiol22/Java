public class CustomerGenerator {
    public void generate(ServicePoint servicePoint, int count) {
        for (int i = 0; i < count; i++) {
            servicePoint.addToQueue(new Customer());
        }
    }
}