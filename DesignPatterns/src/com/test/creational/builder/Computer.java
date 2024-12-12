package com.test.creational.builder;

class Computer {
    private String cpu;
    private int ram;
    private String hdd;
    private String gpu;

    // Getter methods

    // Constructor (private to prevent direct instantiation)
    private Computer(ComputerBuilder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.hdd = builder.hdd;
        this.gpu = builder.gpu;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", hdd='" + hdd + '\'' +
                ", gpu='" + gpu + '\'' +
                '}';
    }

    // Inner Builder class
    public static class ComputerBuilder {
        private String cpu;
        private int ram;
        private String hdd;
        private String gpu;
        
        public ComputerBuilder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder setHdd(String hdd) {
            this.hdd = hdd;
            return this;
        }

        public ComputerBuilder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
