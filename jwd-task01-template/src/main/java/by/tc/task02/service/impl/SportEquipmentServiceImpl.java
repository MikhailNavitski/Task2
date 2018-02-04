package by.tc.task02.service.impl;


import by.tc.task02.dao.DAOFactory;
import by.tc.task02.dao.SportEquipmentFileReader;
import by.tc.task02.dao.util.Shop;
import by.tc.task02.dao.SportEquipmentDAO;
import by.tc.task02.entity.Renter;
import by.tc.task02.main.exception.FileReaderException;
import by.tc.task02.service.SportEquipmentService;

import java.io.IOException;


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
    public void rentSportEquipment(Renter renter, Shop shop)
    {
        sportEquipmentDAO.rentSportEquipment(renter, shop);

    }

    @Override
    public void writeToFile(Shop shop) throws FileReaderException  {
        try {
            applianceFileReader.writeToFileShop(shop);

        }catch (IOException e) {
            throw new FileReaderException("Ошибка записи  данных");
        }

    }

    @Override
    public void readingFile() throws FileReaderException {
        try {
            applianceFileReader.readingFileShop();
        }
        catch (IOException e){
            throw new FileReaderException("Ошибка чтения  данных");
        }
        catch (ClassNotFoundException ee){
            throw new FileReaderException("Файл не найден");
        }
    }
}

