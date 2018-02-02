package by.tc.task01.dao;

import by.tc.task01.dao.impl.SportEquipmentDAOImpl;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final SportEquipmentDAO sportEquipment = new SportEquipmentDAOImpl();

    private DAOFactory() {
    }

    public SportEquipmentDAO getSportEquipmentDAO() {
        return sportEquipment;
    }

    public static DAOFactory getInstance() {
        return instance;
    }
}
