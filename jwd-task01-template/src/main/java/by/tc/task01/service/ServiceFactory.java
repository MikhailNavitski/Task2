package by.tc.task01.service;

import by.tc.task01.service.impl.SportEquipmentServiceImpl;

public final class ServiceFactory {

    private static final ServiceFactory instance = new ServiceFactory();

    private final SportEquipmentService applianceService = new SportEquipmentServiceImpl();

    private ServiceFactory() {
    }

    public SportEquipmentService getSportEquipmentService() {

        return applianceService;
    }

    public static ServiceFactory getInstance() {
        return instance;
    }

}
