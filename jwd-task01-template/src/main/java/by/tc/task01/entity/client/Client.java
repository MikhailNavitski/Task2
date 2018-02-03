package by.tc.task01.entity.client;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private List<Renter> clients = new ArrayList<>();

    public Client() {
    }

    public List<Renter> getClients() {
        return clients;
    }

    public void addClient(Renter renter) {
        clients.add(renter);
    }

    public void setClients(List<Renter> clients) {
        this.clients = clients;
    }
}
