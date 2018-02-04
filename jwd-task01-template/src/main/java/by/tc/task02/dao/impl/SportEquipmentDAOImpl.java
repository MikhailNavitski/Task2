package by.tc.task02.dao.impl;

import by.tc.task02.dao.DAOFactory;
import by.tc.task02.dao.creator.SportEquipmentCreator;
import by.tc.task02.dao.util.Shop;
import by.tc.task02.dao.SportEquipmentDAO;
import by.tc.task02.dao.SportEquipmentFileReader;
import by.tc.task02.entity.Renter;
import by.tc.task02.entity.SportEquipment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SportEquipmentDAOImpl implements SportEquipmentDAO {

    @Override
    public Shop readingFile() throws IOException {
        SportEquipment sportEquipment;
        Shop shop = null;

        DAOFactory factory = DAOFactory.getInstance();
        SportEquipmentFileReader applianceFileReader = factory.getSportEquipmentFileReader();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(applianceFileReader.readingFile()))) {
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

    @Override
    public void rentSportEquipment(Renter renter, Shop shop) {
        Shop.rent(renter, shop);
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


    private static Shop createShop(SportEquipment equipment, Integer value) {
        Shop shop = new Shop();
        shop.add(equipment, value);
        return shop;
    }


}




