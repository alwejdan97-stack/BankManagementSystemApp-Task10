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

    public Customer addCustomer(Customer newCustomer) {
        return customerRepository.save(newCustomer);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.getAllCustomers();
    }

    public Customer findCustomerById(Integer id) {
        return customerRepository.findCustomerById(id);
    }

    public Customer findCustomerByName(String name) {
        return customerRepository.findCustomerByName(name);
    }

    public Customer updateCustomer(Customer newCustomer, Integer customerId) throws Exception {
        Customer existCustomer = customerRepository.findCustomerById(customerId);

        if (existCustomer != null) {
            existCustomer.setCustomerName(newCustomer.getCustomerName());
            existCustomer.setPhoneNumber(newCustomer.getPhoneNumber());
            existCustomer.setEmail(newCustomer.getEmail());
            existCustomer.setAccountNumber(newCustomer.getAccountNumber());
            existCustomer.setBalance(newCustomer.getBalance());
            return customerRepository.save(existCustomer);
        }
        throw new Exception("Invalid Data...");
    }

    public Boolean deleteCustomer(Integer id) {
        Customer customer = customerRepository.findCustomerById(id);
        if (customer != null) {
            customerRepository.delete(customer);
            return true;
        }
        return false;
    }
}
