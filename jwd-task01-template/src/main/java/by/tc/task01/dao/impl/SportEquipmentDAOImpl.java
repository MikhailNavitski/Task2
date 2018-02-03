package by.tc.task01.dao.impl;

import by.tc.task01.dao.FileReaderFactory;
import by.tc.task01.dao.creator.SportEquipmentCreator;
import by.tc.task01.dao.shop.Shop;
import by.tc.task01.dao.SportEquipmentDAO;
import by.tc.task01.dao.SportEquipmentFileReader;
import by.tc.task01.entity.SportEquipment;
import by.tc.task01.entity.category.Category;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SportEquipmentDAOImpl implements SportEquipmentDAO {

    @Override
    public Shop readingFile() throws IOException {
        SportEquipment sportEquipment;
        Shop shop = null;
        FileReaderFactory factory = FileReaderFactory.getInstance();
        SportEquipmentFileReader reader = factory.getFileReader();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(reader.readingFile()))) {
            String fileLine;
            while ((fileLine = bufferedReader.readLine()) != null) {
                if (!fileLine.isEmpty()) {
                    String[] value = getValue(fileLine);
                    sportEquipment = SportEquipmentCreator.maleSportEquipment(value);
                    shop = createShop(sportEquipment, Integer.parseInt(value[3]));
                }

            }
        }
        return shop;
    }

    private static String[] getValue(String fileLine) {
        fileLine = fileLine.replace(":", "");
        fileLine = fileLine.replace(";", ",");
        String[] value = fileLine.split(" ");
        for (int i = 2; i < value.length; i++) {
            value[i] = value[i].substring(value[i].indexOf('=') + 1, value[i].indexOf(','));

        }
        return value;
    }

    public static Category getCategory(String value) {

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

    private static Shop createShop(SportEquipment equipment, Integer value) {
        Shop shop = new Shop();
        shop.add(equipment, value);
        return shop;
    }


}




