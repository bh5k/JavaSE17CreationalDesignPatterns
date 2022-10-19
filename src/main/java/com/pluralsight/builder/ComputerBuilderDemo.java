package com.pluralsight.builder;

public class ComputerBuilderDemo {

    public static void main (String [] args) {
        Computer.ComputerBuilder builder = new Computer.ComputerBuilder();
        builder.addHdd(HDD.MAX).addRam(RAM.UPGRADED).hasUsbc(true).hasGigabitWifi(true);

        Computer computer = builder.build();

        System.out.println(computer.getDiskSize());
        System.out.println(computer.getRamSize());
        System.out.println(computer.hasUsbc());
        System.out.println(computer.hasGigabitWifi());
    }
}
