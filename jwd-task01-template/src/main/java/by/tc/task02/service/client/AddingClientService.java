package by.tc.task02.service.client;

import by.tc.task02.entity.Renter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddingClientService {

    private static BufferedReader reader;

    public static Renter createRenter() throws IOException {
        Renter renter = new Renter();
        reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите ваше имя");
        String name = reader.readLine();
        renter.setName(name);
        renter.setAvailableItems(3);
        return renter;
    }
}
