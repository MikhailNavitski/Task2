package by.tc.task02.dao.creator;

import by.tc.task02.entity.SportEquipment;
import by.tc.task02.entity.category.Category;


public class SportEquipmentCreator {
    public static SportEquipment maleSportEquipment(String[] value) {
        SportEquipment equipment = new SportEquipment();
        equipment.setCategory(getCategory(value[0]));
        equipment.setTitle(value[2]);
        equipment.setQuantity(Integer.parseInt(value[3]));
        equipment.setPrice(Integer.parseInt(value[4]));
        return equipment;
    }

    private static Category getCategory(String value) {

        if (value.contains("BALL")) {
            return Category.BALL;
        }
        if (value.contains("RACKET")) {
            return Category.RACKET;
        }
        if (value.contains("SKATES")) {
            return Category.SKATES;
        }
        if (value.contains("SKIING")) {
            return Category.SKIING;
        }
        if (value.contains("BIKE")) {
            return Category.BIKE;
        }
        if (value.contains("SNOWBOARD")) {
            return Category.SNOWBOARD;
        }
        return null;
    }
}
