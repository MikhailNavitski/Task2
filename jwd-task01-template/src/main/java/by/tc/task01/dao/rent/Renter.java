package by.tc.task01.dao.rent;

import by.tc.task01.entity.SportEquipment;

import java.io.Serializable;

public class Renter implements Serializable {
    private String name;
    private String firstItem;
    private String secondItem;
    private String thirdItem;
    private int availableItems;

    public Renter() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getFirstItem() {
        return firstItem;
    }

    public void setFirstItem(String firstItem) {
        this.firstItem = firstItem;
    }

    public String getSecondItem() {
        return secondItem;
    }

    public void setSecondItem(String secondItem) {
        this.secondItem = secondItem;
    }

    public String getThirdItem() {
        return thirdItem;
    }

    public void setThirdItem(String thirdItem) {
        this.thirdItem = thirdItem;
    }

    public int getAvailableItems() {
        return availableItems;
    }

    public void setAvailableItems(int availableItems) {
        this.availableItems = availableItems;
    }

    public void setItem(SportEquipment equipment) {
        if (firstItem == null) {
            firstItem = equipment.toString();
            availableItems--;

        }
        if (secondItem == null) {
            secondItem = equipment.toString();
            availableItems--;

        }
        if (thirdItem == null) {
            thirdItem = equipment.toString();
            availableItems--;

        }

    }

    public void incAvailableItems() {
        availableItems++;
    }

    public boolean hasRentedItems() {
        if (firstItem == null && secondItem == null && thirdItem == null) {
            return false;
        }
        else return true;
    }


    @Override
    public String toString() {
        return name + " " ;
    }
}