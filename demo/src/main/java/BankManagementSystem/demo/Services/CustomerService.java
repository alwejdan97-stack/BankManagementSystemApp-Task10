package BankManagementSystem.demo.Services;

import BankManagementSystem.demo.Entities.Customer;
import BankManagementSystem.demo.Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public Customer addCustomer(Customer newCustomer){
        Customer customerToAdd=new Customer();
        customerToAdd.setCustomerId(newCustomer.getCustomerId());
        customerToAdd.setCustomerName(newCustomer.getCustomerName());
        customerToAdd.setPhoneNumber(newCustomer.getPhoneNumber());
        customerToAdd.setEmail(newCustomer.getEmail());
        customerToAdd.setAccountNumber(newCustomer.getAccountNumber());
        return customerRepository.save(customerToAdd);
    }

    public List<Customer> getAllCustomers(){
        return customerRepository.getAllCustomers();
    }

    public Customer findCustomerById(Integer id){
        return customerRepository.findCustomerById(id);
    }

    public Customer findCustomerByName(String name){
        return customerRepository.findCustomerByName(name);
    }
}
