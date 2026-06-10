package BankManagementSystem.demo.Controllers;

import BankManagementSystem.demo.Entities.Customer;
import BankManagementSystem.demo.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping("addCustomer")
    public Customer addCustomer(@RequestBody Customer newCustomer){
        return customerService;
    }
}
