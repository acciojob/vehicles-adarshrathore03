package com.driver;

public class Boat implements WaterVehicle{
    public String name;
    public int capacity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    @Override
    public String getVehicleName(){
        return this.name;
    }

    @Override
    public int getVehicleCapacity(){
        return this.capacity;
    }
}
