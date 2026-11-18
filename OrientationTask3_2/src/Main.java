public class Main {
    public static void main(String[] args) {
        int draws = 1000;
        int mxage = 35;
        int[][] age = {
                {10, 19},
                {35, 20},
                {60, 21},
                {75, 22},
                {85, 23},
                {93, 25},
                {98, 28},
                {100, 35}

        };
        for (int i = 1; i <= 3; i++){
            int[] points = new int[mxage + 1];
            for (int j = 0; j < draws; j++){
                int x  =(int) (Math.random() * 100) + 1;

                int k = 0;
                while (x > age[k][0]){
                    k++;
                }
                points[age[k][1]]++;
            }
            System.out.println("Run " + i);
            System.out.println("Age  Points  Percent");
            for (int l = 0; l <= mxage; l++) {
                if (points[l] != 0) {
                    System.out.println(l + "   " + points[l] + "     " + (points[l] * 100.0 / draws) + " %");
                }
            }
            System.out.println();

        }


    }
}
