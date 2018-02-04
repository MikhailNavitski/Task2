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
            Category category = Category.BALL;
            return category;
        }
        if (value.contains("RACKET")) {
            Category category = Category.RACKET;
            return category;
        }
        if (value.contains("SKATES")) {
            Category category = Category.SKATES;
            return category;
        }
        if (value.contains("SKIING")) {
            Category category = Category.SKIING;
            return category;
        }
        if (value.contains("BIKE")) {
            Category category = Category.BIKE;
            return category;
        }
        if (value.contains("SNOWBOARD")) {
            Category category = Category.SNOWBOARD;
            return category;
        }
        return null;
    }
}
