public class OrientationTask1_6 {
    public static void main(String[] args) {
        int runs = (int)(Math.random() * 2) + 6;

        for (int run = 1; run <= runs; run++) {
            System.out.println("=== Run " + run + " ===");
            ServicePoint servicePoint = new ServicePoint();
            CustomerGenerator generator = new CustomerGenerator();

            generator.generate(servicePoint, 5);
            servicePoint.serve();

            double average = Math.round(servicePoint.getAverageServiceTime() * 10) / 10.0;
            System.out.println("Average service time: " + average + " ms");
            System.out.println();
        }
    }
}