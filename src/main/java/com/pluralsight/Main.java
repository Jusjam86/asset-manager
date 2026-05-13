package com.pluralsight;

import java.util.ArrayList;

public class Main {
    static void main() {

        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(new House("vacation home", "04/18/2025", 300000.01, "Japan", 4, 2500, 1000));
        assets.add(new House("My Home", "12/20/2023", 500000.25, "Washington", 3, 3000, 1000));
        assets.add(new Vehicle("My car", "10/24/2023", 30000.00, "Toyota Camry", 2024, 20000));
        assets.add(new Vehicle("Brother's car", "06/05/2025", 40000.00, "Toyota GR Carolla", 2023, 16000));

        for (Asset asset : assets) {

            System.out.println();
            System.out.println(asset.getDescription() + ", " + asset.getDateAcquired() + ", $" + asset.getOriginalCost() + " $" + asset.getValue());

            String message = "";
            if (assets.get(0) instanceof House){
                House house = (House) assets.get(0);
                message = "House at " + house.getAddress();

            } else if (assets.get(2) instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) assets.get(2);
                message = "Vehicle: " + vehicle.getYear() + " " + vehicle.getMakeModel();

            }
            System.out.println();
            System.out.println(message);
        }
    }
}
