package BankManagementSystem.demo.Controllers;

import BankManagementSystem.demo.Entities.Customer;
import BankManagementSystem.demo.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping("addCustomer")
    public Customer addCustomer(@RequestBody Customer newCustomer){
        return customerService.addCustomer(newCustomer);
    }

    @GetMapping("getAllCustomers")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping("findCustomerById")
    public Customer findCustomerById(@PathVariable Integer id){
        return customerService.findCustomerById(id);
    }

    @GetMapping("findCustomerByName")
    public Customer findCustomerByName(@PathVariable String name){
        return customerService.findCustomerbyName(name);
    }
}
