package by.tc.task01.dao.creator;

import by.tc.task01.dao.impl.SportEquipmentDAOImpl;
import by.tc.task01.entity.SportEquipment;


public class SportEquipmentCreator {
    public static SportEquipment maleSportEquipment(String[] value) {
        SportEquipment equipment = new SportEquipment();
        equipment.setCategory(SportEquipmentDAOImpl.getCategory(value[0]));
        equipment.setTitle(value[2]);
        equipment.setQuantity(Integer.parseInt(value[3]));
        equipment.setPrice(Integer.parseInt(value[4]));
        return equipment;
    }
}
