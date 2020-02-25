package com.pkg.Test1;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test1 {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Random random = new Random();
        inventory.addGuitar(String.valueOf(random.ints().filter(i->!(i<=0)).findAny().getAsInt()), "Durga", "Stratocastor", "electric", "Alder", "Alder", 21350.50);
        inventory.addGuitar(String.valueOf(random.ints().filter(i->!(i<=0)).findAny().getAsInt()), "Radha", "Stratocastor", "acoustic", "sitka", "Alder", 21290.50);

        Guitar guitar = inventory.searchGuitar(new Guitar("", "Radha", "Stratocastor", "acoustic", "sitka", "Alder", 0.0));
        System.out.println(guitar);



    }
}
