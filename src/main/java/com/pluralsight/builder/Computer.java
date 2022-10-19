package com.pluralsight.builder;

public class Computer {

    public static class ComputerBuilder {
        private HDD diskSize;
        private RAM ramSize;
        private boolean hasUsbc;
        private boolean hasGigabitWifi;

        public ComputerBuilder() {

        }

        public Computer build () {
            return new Computer(this);
        }

        public ComputerBuilder addRam (RAM ramSize) {
            this.ramSize = ramSize;
            return this;
        }

        public ComputerBuilder addHdd (HDD diskSize) {
            this.diskSize = diskSize;
            return this;
        }

        public ComputerBuilder hasUsbc (boolean hasUsbc) {
            this.hasUsbc = hasUsbc;
            return this;
        }

        public ComputerBuilder hasGigabitWifi (boolean hasGigabitWifi) {
            this.hasGigabitWifi = hasGigabitWifi;
            return this;
        }

    }

    private HDD diskSize;
    private RAM ramSize;
    private boolean hasUsbc;
    private boolean hasGigabitWifi;

    public Computer (ComputerBuilder builder) {
        this.diskSize = builder.diskSize;
        this.ramSize = builder.ramSize;
        this.hasUsbc = builder.hasUsbc;
        this.hasGigabitWifi = builder.hasGigabitWifi;
    }

    public HDD getDiskSize() {
        return diskSize;
    }

    public RAM getRamSize() {
        return ramSize;
    }

    public boolean hasUsbc() {
        return hasUsbc;
    }

    public boolean hasGigabitWifi() {
        return hasGigabitWifi;
    }

}
