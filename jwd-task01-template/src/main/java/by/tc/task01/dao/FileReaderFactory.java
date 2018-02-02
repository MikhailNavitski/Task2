package by.tc.task01.dao;

import by.tc.task01.dao.impl.SportEquipmentFileReaderImpl;

public class FileReaderFactory {
    private static final FileReaderFactory instance = new FileReaderFactory();

    private final SportEquipmentFileReader applianceFileReader = new SportEquipmentFileReaderImpl();

    private FileReaderFactory() {
    }

    public SportEquipmentFileReader getFileReader() {
        return applianceFileReader;
    }

    public static FileReaderFactory getInstance() {
        return instance;
    }
}
