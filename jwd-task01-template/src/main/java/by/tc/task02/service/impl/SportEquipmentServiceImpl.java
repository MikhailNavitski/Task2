package by.tc.task02.service.impl;


import by.tc.task02.dao.DAOFactory;
import by.tc.task02.dao.SportEquipmentFileReader;
import by.tc.task02.dao.util.RentedUnits;
import by.tc.task02.dao.util.Shop;
import by.tc.task02.dao.SportEquipmentDAO;
import by.tc.task02.entity.SportEquipment;
import by.tc.task02.entity.category.Criteria;
import by.tc.task02.main.exception.FileReaderException;
import by.tc.task02.service.SportEquipmentService;

import java.io.IOException;
import java.util.List;


public class SportEquipmentServiceImpl implements SportEquipmentService {

    private DAOFactory factory = DAOFactory.getInstance();
    private SportEquipmentDAO sportEquipmentDAO = factory.getSportEquipmentDAO();
    private SportEquipmentFileReader applianceFileReader = factory.getSportEquipmentFileReader();

    @Override
    public Shop find() throws FileReaderException {
        try {
            Shop shop;
            shop = sportEquipmentDAO.readingFile();
            return shop;
        } catch (IOException e) {
            throw new FileReaderException("Ошибка чтения данных");
        }
    }


    @Override
    public void writeToFile(Shop shop) throws FileReaderException {
        try {
            applianceFileReader.writeToFileShop(shop);

        } catch (IOException e) {
            throw new FileReaderException("Ошибка записи  данных");
        }

    }

    @Override
    public void readingFile() throws FileReaderException {
        try {
            applianceFileReader.readingFileShop();
        } catch (IOException e) {
            throw new FileReaderException("Ошибка чтения  данных");
        } catch (ClassNotFoundException ee) {
            throw new FileReaderException("Файл не найден");
        }
    }

    @Override
    public SportEquipment searchGoods(Criteria criteria, List<SportEquipment> rentedUnits, Shop shop) {
        SportEquipment equipment;
        equipment = sportEquipmentDAO.searchGoods(criteria, rentedUnits, shop);
        return equipment;
    }

    @Override
    public void addUnits(RentedUnits units,SportEquipment equipment) {
        sportEquipmentDAO.addUnits(units,equipment);
    }
}

