public class Tester {
    public static void main(String[] args) {


        SmartphonePrice[] smartphonePrices = new SmartphonePrice[]{
                new SmartphonePrice("producer", 300),
                new SmartphonePrice("producer", 200),
                new SmartphonePrice("retail", 500),
                new SmartphonePrice("retail", 250),
        };

        Smartphone[] smartphones = new Smartphone[]{
                new Smartphone("Oppo", "plus", 5100, smartphonePrices[0], smartphonePrices[2]),
                new Smartphone("Samsung", "plus", 5200, smartphonePrices[1], smartphonePrices[3]),
        };

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        boolean result = smartphones[0].equals(smartphones[1]);
        System.out.println("i due smartphone sono uguali? " + result);


        try {
            Smartphone cloned = (Smartphone) smartphones[1].clone();
            System.out.println(cloned);
            boolean result2 = smartphones[1].equals(cloned);
            System.out.println(result2);
            System.out.println(smartphones[1] == cloned);
        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("Error");
        }


    }
}