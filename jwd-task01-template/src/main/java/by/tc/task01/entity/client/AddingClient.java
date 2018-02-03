package by.tc.task01.entity.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddingClient {

    private static BufferedReader reader;
    private static Client client;

    public static Client addClient(Renter renter) throws IOException {
        client = new Client();
        renter = createRenter(renter);
        client.addClient(renter);
        return client;
    }

    private static Renter createRenter(Renter renter) throws IOException {

        reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите ваше имя");
        String name = reader.readLine();
        renter.setName(name);
        renter.setAvailableItems(3);
        return renter;
    }
}
