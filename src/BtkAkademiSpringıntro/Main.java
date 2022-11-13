package BtkAkademiSpringıntro;

public class Main {

    public static void main(String[] args) {
        CustomerManager manager = new CustomerManager(new MySqlCustomer());
        manager.add();
    }
}
