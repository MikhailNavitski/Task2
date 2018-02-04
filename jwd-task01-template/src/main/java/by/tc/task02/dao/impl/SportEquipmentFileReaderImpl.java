package by.tc.task02.dao.impl;

import by.tc.task02.dao.SportEquipmentFileReader;
import by.tc.task02.dao.util.Shop;

import java.io.*;
import java.util.ResourceBundle;

public class SportEquipmentFileReaderImpl implements SportEquipmentFileReader {
    public File readingFile() {
        String filePath = ResourceBundle.getBundle("source_name").getString("source.name");
        File file;
        file = new File(filePath);
        return file;
    }

    public void writeToFileShop(Shop shop) throws IOException {
        String filePath = ResourceBundle.getBundle("source_name").getString("source.shop");
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(shop);
            oos.flush();
            oos.close();
        }

    }

    public void readingFileShop() throws IOException,ClassNotFoundException {
        String filePath = ResourceBundle.getBundle("source_name").getString("source.shop");
        try (FileInputStream fis = new FileInputStream(filePath)) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            Shop shop = (Shop) ois.readObject();
            System.out.println("\nТовары, которые остались в магазине");
            System.out.println("-----------------------------------------");
            System.out.println(shop.getGoods());
            System.out.println("-----------------------------------------");
            System.out.println("Товары , которые были отданы в прокат");
            System.out.println("---------------------------------------");
            System.out.println(shop.getClientRentedUnits());
            System.out.println("---------------------------------------");

            ois.close();
        }

    }
}
