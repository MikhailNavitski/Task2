package by.tc.task02.dao;

import by.tc.task02.dao.util.Shop;

import java.io.File;
import java.io.IOException;

public interface SportEquipmentFileReader {
    File readingFile() ;
    void writeToFileShop(Shop shop) throws IOException;
    void readingFileShop() throws IOException,ClassNotFoundException;
}
