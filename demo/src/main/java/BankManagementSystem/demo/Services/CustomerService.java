package BankManagementSystem.demo.Services;

import BankManagementSystem.demo.Entities.Customer;
import BankManagementSystem.demo.Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public Customer addCustomer(Customer newCustomer){

    }
}
