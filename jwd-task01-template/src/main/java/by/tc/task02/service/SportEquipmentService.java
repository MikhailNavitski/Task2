package by.tc.task02.service;

import by.tc.task02.dao.util.RentedUnits;
import by.tc.task02.dao.util.Shop;
import by.tc.task02.entity.SportEquipment;
import by.tc.task02.entity.category.Criteria;
import by.tc.task02.main.exception.FileReaderException;

import java.util.List;

public interface SportEquipmentService {

    Shop find() throws FileReaderException;


    void writeToFile(Shop shop) throws FileReaderException;

    void readingFile() throws FileReaderException;

    SportEquipment searchGoods(Criteria criteria, List<SportEquipment> rentedUnits, Shop shop);

    void addUnits(RentedUnits units,SportEquipment equipment);
}
