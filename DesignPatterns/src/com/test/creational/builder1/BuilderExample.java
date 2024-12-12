package com.test.creational.builder1;

public class BuilderExample {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder()
                .setCpu("Intel i7")
                .setRam(16)
                .setHdd("1TB SSD")
                .setGpu("NVIDIA RTX 3080")
                .build();
        System.out.println(computer);
    }
}