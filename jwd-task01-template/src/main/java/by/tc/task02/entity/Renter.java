package by.tc.task02.entity;

import java.io.Serializable;

public class Renter implements Serializable{
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
        else if (secondItem == null) {
            secondItem = equipment.toString();
            availableItems--;

        }
        else if (thirdItem == null) {
            thirdItem = equipment.toString();
            availableItems--;

        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Renter renter = (Renter) o;

        if (availableItems != renter.availableItems) return false;
        if (name != null ? !name.equals(renter.name) : renter.name != null) return false;
        if (firstItem != null ? !firstItem.equals(renter.firstItem) : renter.firstItem != null) return false;
        if (secondItem != null ? !secondItem.equals(renter.secondItem) : renter.secondItem != null) return false;
        return thirdItem != null ? thirdItem.equals(renter.thirdItem) : renter.thirdItem == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (firstItem != null ? firstItem.hashCode() : 0);
        result = 31 * result + (secondItem != null ? secondItem.hashCode() : 0);
        result = 31 * result + (thirdItem != null ? thirdItem.hashCode() : 0);
        result = 31 * result + availableItems;
        return result;
    }

    @Override
    public String toString() {
        return name + " ";
    }
}