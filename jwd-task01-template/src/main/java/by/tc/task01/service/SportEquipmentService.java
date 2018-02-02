package by.tc.task01.service;

import by.tc.task01.dao.shop.Shop;
import by.tc.task01.main.exception.FileReaderException;

public interface SportEquipmentService {

    Shop find() throws FileReaderException;

}
