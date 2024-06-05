package org.ncu.GROCERY.CONTROLLER;

import org.ncu.GROCERY.ENTITY.Customer;
import org.ncu.GROCERY.SERVICE.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/post")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.saveOrUpdateCustomer(customer);
    }

    @GetMapping("/get/{customerId}")
    public Customer getCustomerById(@PathVariable ("customerId")int customerId) {
        return customerService.getCustomerById(customerId);
    }

    @PutMapping("/put/{customerId}")
    public Customer updateCustomer(@PathVariable ("customerId") int customerId, @RequestBody Customer customer) {
        return customerService.saveOrUpdateCustomer(customer);
    }

    @DeleteMapping("/delete/{customerId}")
    public String deleteCustomer(@PathVariable ("customerId") int customerId) {
        customerService.deleteCustomer(customerId);
        return "Customer with ID " + customerId + " deleted successfully";
    }
}
