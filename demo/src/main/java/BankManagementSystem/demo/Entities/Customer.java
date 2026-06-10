package BankManagementSystem.demo.Entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name ="Customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int customerId;
    String customerName;
    int accountNumber;
    double balance;
    String email;
    String phoneNumber;
}
