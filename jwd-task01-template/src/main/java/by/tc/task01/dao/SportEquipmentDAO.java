package by.tc.task01.dao;

import by.tc.task01.dao.shop.Shop;

import java.io.IOException;

public interface SportEquipmentDAO {
   Shop readingFile() throws IOException;
}
