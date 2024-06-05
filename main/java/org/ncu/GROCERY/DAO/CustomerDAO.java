package org.ncu.GROCERY.DAO;



import java.util.List;

import org.ncu.GROCERY.ENTITY.Customer;

public interface CustomerDAO {
    Customer getCustomerById(int customerId);
    Customer saveOrUpdateCustomer(Customer customer);
    void deleteCustomer(int customerId);
    List<Customer> getAllCustomers();
}
