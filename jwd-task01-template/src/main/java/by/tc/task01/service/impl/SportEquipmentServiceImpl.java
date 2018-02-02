package by.tc.task01.service.impl;


import by.tc.task01.dao.DAOFactory;
import by.tc.task01.dao.shop.Shop;
import by.tc.task01.dao.SportEquipmentDAO;
import by.tc.task01.main.exception.FileReaderException;
import by.tc.task01.service.SportEquipmentService;

import java.io.IOException;


public class SportEquipmentServiceImpl implements SportEquipmentService {

    @Override
    public Shop find() throws FileReaderException{
        try {
            Shop shop;
            DAOFactory factory = DAOFactory.getInstance();
            SportEquipmentDAO sportEquipmentDAO = factory.getSportEquipmentDAO();
            shop = sportEquipmentDAO.readingFile();
            return shop;
        }
        catch (IOException e){
            throw  new FileReaderException("Ошибка чтения данных");
        }
    }
}

