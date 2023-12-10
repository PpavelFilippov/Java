public class Main {
    public static void main(String[] args) {

        String firstString = "I`m first";
        String secondString = "I`m second";

        Car germanCar = new Car("Volkswagen", "Touareg", 2.5);
        Car japaneseCar = new Car("Toyota", "Land Cruiser 300", 3.3);

        SwappingObject<String> firstStr = new SwappingObject<>(firstString);
        SwappingObject<String> secondStr = new SwappingObject<>(secondString);

        SwappingObject<Car> firstCar = new SwappingObject<>(germanCar);
        SwappingObject<Car> secondCar = new SwappingObject<>(japaneseCar);

        //Example of standard class swapping
        System.out.println("String objects before swap:");
        System.out.println("First string: " + firstString);
        System.out.println("Second string: " + secondString);
        SwappingObject.swapObjects(firstStr, secondStr);
        firstString = firstStr.getObjectData();
        secondString = secondStr.getObjectData();
        System.out.println("String objects after swap:");
        System.out.println("First string: " + firstString);
        System.out.println("Second string: " + secondString);

        //Example of user`s class swapping
        System.out.println("Car objects before swap:");
        System.out.println("German string: " + germanCar);
        System.out.println("Japanese string: " + japaneseCar);
        SwappingObject.swapObjects(firstCar, secondCar);
        germanCar = firstCar.getObjectData();
        japaneseCar = secondCar.getObjectData();
        System.out.println("Car objects after swap:");
        System.out.println("First string: " + germanCar);
        System.out.println("Second string: " + japaneseCar);

        //Example of swapping objects with different types (must throw the exception)
        String stringType = "string";
        Integer integerType = 5;
        SwappingObject<String> strType = new SwappingObject<>(stringType);
        SwappingObject<Integer> intType = new SwappingObject<>(integerType);
        System.out.println("Different typed swapping:");
        System.out.println("First object: " + stringType);
        System.out.println("Second object: " + integerType);
        SwappingObject.swapObjects(strType, intType);

    }

    private static class Car {
        String brand;
        String model;
        double engineVolume;

        Car(String brand, String model, double engineVolume) {
            this.brand = brand;
            this.model = model;
            this.engineVolume = engineVolume;
        }

        public String toString() {
            return "Car: { " + "Brand: " + brand + ", Model: " + model  + ", Volume of engine: " + engineVolume + 'L' + '}';
        }
    }
}
