package by.tc.task01.dao.file;

import by.tc.task01.dao.shop.Shop;
import by.tc.task01.entity.client.RentedUnits;

import java.io.*;

public class FileApp {
    public static void writeToFileShop(Shop shop) {

        try (FileOutputStream fos = new FileOutputStream("jwd-task01-template//src//main//resources//shop.txt")) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(shop);
            oos.flush();
            oos.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void readingFileShop() {
        try (FileInputStream fis = new FileInputStream("jwd-task01-template//src//main//resources//shop.txt")) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            Shop shop = (Shop) ois.readObject();
            System.out.println(shop.getGoods());
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void wtiteToFileRented(RentedUnits units) {
        try (FileOutputStream fos = new FileOutputStream("jwd-task01-template//src//main//resources//rentedEquipment.txt")) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(units);
            oos.flush();
            oos.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void readingFileRented() {
        try (FileInputStream fis = new FileInputStream("jwd-task01-template//src//main//resources//rentedEquipment.txt")) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            RentedUnits units = (RentedUnits) ois.readObject();
            System.out.println(units.getRentedUnits());
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}

