package by.tc.task02.dao;

import by.tc.task02.dao.util.RentedUnits;
import by.tc.task02.dao.util.Shop;
import by.tc.task02.entity.SportEquipment;
import by.tc.task02.entity.category.Criteria;

import java.io.IOException;
import java.util.List;

public interface SportEquipmentDAO {
    Shop readingFile() throws IOException;
    void addUnits(RentedUnits units,SportEquipment equipment);

    SportEquipment searchGoods(Criteria criteria, List<SportEquipment> rentedUnits, Shop shop);
}
