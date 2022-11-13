package BtkAkademiSpringıntro;

public class MySqlCustomer implements ICustomerDal{
    @Override
    public void add() {
        System.out.println("Mysql veritabanına eklendi.");
    }
}