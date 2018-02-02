package by.tc.task01.dao.impl;

import by.tc.task01.dao.SportEquipmentFileReader;

import java.io.File;
import java.util.ResourceBundle;

public class SportEquipmentFileReaderImpl implements SportEquipmentFileReader {
    public File readingFile() {
        String filePath = ResourceBundle.getBundle("source_name").getString("source.name");
        File file;
        file = new File(filePath);
        return file;
    }
}
