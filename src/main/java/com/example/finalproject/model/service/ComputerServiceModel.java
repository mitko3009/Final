package com.example.finalproject.model.service;

import com.example.finalproject.model.entity.CityEntity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class ComputerServiceModel {

    private String make;
    private String model;
    private String cpu;
    private String gpu;
    private Integer ram;
    private Integer diskSpace;
    private double price;
    private int powerSupply;
    private String motherboard;
    private CityEntity city;

    public CityEntity getCity() {
        return city;
    }

    public void setCity(CityEntity city) {
        this.city = city;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public int getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(int powerSupply) {
        this.powerSupply = powerSupply;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getDiskSpace() {
        return diskSpace;
    }

    public void setDiskSpace(Integer diskSpace) {
        this.diskSpace = diskSpace;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
