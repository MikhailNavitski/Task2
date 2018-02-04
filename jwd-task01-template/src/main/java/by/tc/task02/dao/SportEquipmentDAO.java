package by.tc.task02.dao;

import by.tc.task02.dao.util.Shop;
import by.tc.task02.entity.Renter;

import java.io.IOException;

public interface SportEquipmentDAO {
    Shop readingFile() throws IOException;
    void rentSportEquipment(Renter renter, Shop shop);
}
