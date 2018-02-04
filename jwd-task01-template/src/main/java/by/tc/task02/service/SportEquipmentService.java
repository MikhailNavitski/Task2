package by.tc.task02.service;

import by.tc.task02.dao.util.Shop;
import by.tc.task02.entity.Renter;
import by.tc.task02.main.exception.FileReaderException;

public interface SportEquipmentService {

    Shop find() throws FileReaderException;

    void rentSportEquipment(Renter renter, Shop shop) throws FileReaderException;

    void writeToFile(Shop shop) throws FileReaderException;

    void readingFile() throws FileReaderException;

}
