package verschachtelung;



public class Temperaturen {

    public static void main(String[] args) {
        double[][] temperatures = {
            {20.5, 22.3, 19.8, 21.0, 23.1, 20.4, 18.7}, // Stadt 1
            {15.5, 17.2, 16.3, 14.8, 15.7, 16.0, 14.9}, // Stadt 2
            {25.1, 26.3, 24.8, 23.5, 24.7, 25.0, 23.9}  // Stadt 3
        };

        for (int i = 0; i < temperatures.length; i++) {
            double sum = 0;
            for (int j = 0; j < temperatures[i].length; j++) {
                sum += temperatures[i][j];
            }
            double average = sum / temperatures[i].length;
            System.out.println("Durchschnittstemperatur für Stadt " + (i + 1) + ": " + Math.round(average));
        }
    }
}

