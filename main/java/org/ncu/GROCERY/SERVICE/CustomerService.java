package org.ncu.GROCERY.SERVICE;



import java.util.List;

import org.ncu.GROCERY.ENTITY.Customer;

public interface CustomerService {
    Customer getCustomerById(int customerId);
    Customer saveOrUpdateCustomer(Customer customer);
    void deleteCustomer(int customerId);
    List<Customer> getAllCustomers();
}

