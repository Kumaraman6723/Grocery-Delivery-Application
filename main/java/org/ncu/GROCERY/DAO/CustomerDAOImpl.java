package org.ncu.GROCERY.DAO;


import java.util.List;

import org.ncu.GROCERY.ENTITY.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public Customer getCustomerById(int customerId) {
        return entityManager.find(Customer.class, customerId);
    }

    @Override
    @Transactional
    public Customer saveOrUpdateCustomer(Customer customer) {
        return entityManager.merge(customer);
    }

    @Override
    @Transactional
    public void deleteCustomer(int customerId) {
        Customer customer = entityManager.find(Customer.class, customerId);
        if (customer != null) {
            entityManager.remove(customer);
        }
    }

    @Override
    @Transactional
    public List<Customer> getAllCustomers() {
        return entityManager.createQuery("SELECT c FROM Customer c", Customer.class).getResultList();
    }
}

