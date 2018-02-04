package by.tc.task02.dao;

import by.tc.task02.dao.impl.SportEquipmentDAOImpl;
import by.tc.task02.dao.impl.SportEquipmentFileReaderImpl;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final SportEquipmentDAO sportEquipment = new SportEquipmentDAOImpl();
    private final SportEquipmentFileReader sportEquipmentFileReader = new SportEquipmentFileReaderImpl();

    private DAOFactory() {
    }

    public SportEquipmentDAO getSportEquipmentDAO() {
        return sportEquipment;
    }

    public SportEquipmentFileReader getSportEquipmentFileReader() {
        return sportEquipmentFileReader;
    }



    public static DAOFactory getInstance() {
        return instance;
    }

}
