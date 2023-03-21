package org.example.hw1.model;


public class Notebook {
    private String model;
    private int ram;
    private int hdd;
    private String os;
    private String color;

    public Notebook(String model, int ram, int hdd, String os, String color) {
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    public String getModel() {
        return model.toLowerCase();
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public String getOs() {
        return os.toLowerCase();
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color.toLowerCase();
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return model +
                ", ОЗУ: " + ram +
                ", объем жесткого диска: " + hdd +
                ", операционная система: " + os +
                ", цвет: " + color;
    }
}