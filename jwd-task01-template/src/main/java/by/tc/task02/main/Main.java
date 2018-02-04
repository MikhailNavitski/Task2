package by.tc.task02.main;

import by.tc.task02.dao.util.*;
import by.tc.task02.entity.Renter;
import by.tc.task02.main.exception.FileReaderException;
import by.tc.task02.main.sportequipment_info.SportEquipmentInfo;
import by.tc.task02.service.ServiceFactory;
import by.tc.task02.service.SportEquipmentService;
import by.tc.task02.service.client.AddingClientService;

import java.io.IOException;


public class Main {

    public static void main(String[] args) {
        try {

            Shop shop;
            Renter renter;
            ServiceFactory factory = ServiceFactory.getInstance();
            SportEquipmentService service = factory.getSportEquipmentService();
            shop = service.find();
            System.out.println("Товары , которые находятся в магазине");
            System.out.println("--------------------------------------");
            SportEquipmentInfo.printGoods(shop);
            System.out.println("--------------------------------------");

                //Клиент1///

            renter = AddingClientService.createRenter();
            service.rentSportEquipment(renter, shop);
            service.writeToFile(shop);
            service.readingFile();

                //Клиент2///

            renter = AddingClientService.createRenter();
            service.rentSportEquipment(renter, shop);
            service.writeToFile(shop);
            service.readingFile();


        } catch (FileReaderException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        }

    }

}
