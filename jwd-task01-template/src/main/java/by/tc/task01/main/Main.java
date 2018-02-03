package by.tc.task01.main;

import by.tc.task01.dao.file.FileApp;
import by.tc.task01.dao.shop.Shop;
import by.tc.task01.entity.client.*;
import by.tc.task01.main.exception.FileReaderException;
import by.tc.task01.main.sportequipment_info.SportEquipmentInfo;
import by.tc.task01.service.ServiceFactory;
import by.tc.task01.service.SportEquipmentService;

import java.io.IOException;


public class Main {
    private static Client client;

    public static void main(String[] args) {
        try {
            Shop shop;
            Renter renter = new Renter();
            ServiceFactory factory = ServiceFactory.getInstance();
            SportEquipmentService service = factory.getSportEquipmentService();
            shop = service.find();
            System.out.println("Товары , которые находятся в магазине");
            System.out.println("--------------------------------------");
            SportEquipmentInfo.printGoods(shop);
            System.out.println("--------------------------------------");
            //////////////////ПОИСК//////////////////////

            client = AddingClient.addClient(renter);
            shop.rent(client);
            Rent.rent(shop);
            System.out.println("\nТовары, которые остались в магазине");
            System.out.println("-----------------------------------------");
            FileApp.writeToFileShop(shop);
            FileApp.readingFileShop();
            System.out.println("-----------------------------------------");

        } catch (FileReaderException e) {
            e.getMessage();
        } catch (IOException e) {
            System.out.println("Что-то пошло не так");
        }

    }

}
