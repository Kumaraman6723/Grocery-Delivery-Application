package org.ncu.GROCERY.SERVICE;

import java.util.List;

import org.ncu.GROCERY.DAO.CustomerDAO;
import org.ncu.GROCERY.ENTITY.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    @Override
    @Transactional
    public Customer getCustomerById(int customerId) {
        return customerDAO.getCustomerById(customerId);
    }

    @Override
    @Transactional
    public Customer saveOrUpdateCustomer(Customer customer) {
        return customerDAO.saveOrUpdateCustomer(customer);
    }

    @Override
    @Transactional
    public void deleteCustomer(int customerId) {
        customerDAO.deleteCustomer(customerId);
    }

    @Override
    @Transactional
    public List<Customer> getAllCustomers() {
        return customerDAO.getAllCustomers();
    }
}

