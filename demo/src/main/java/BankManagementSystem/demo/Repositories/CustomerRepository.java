package BankManagementSystem.demo.Repositories;

import BankManagementSystem.demo.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    @Query("SELECT C FROM Customer C WHERE C.customerName=NOTNULL")
    List<Customer> getAllCustomers();

    @Query("SELECT C FROM Customer C WHERE C.customerId=:customerId")
    Customer findCustomerById(@Param ("customerId") Integer id);

    @Query("SELECT C FROM Customer C WHERE C.customerName=:customerName")
    Customer findCustomerByName(@Param("customerName") String name);
}
