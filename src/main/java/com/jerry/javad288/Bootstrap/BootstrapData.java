package com.jerry.javad288.Bootstrap;

import com.jerry.javad288.Entities.Customer;
import com.jerry.javad288.dao.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public BootstrapData(CustomerRepository customerRepository) {

        this.customerRepository = customerRepository;

    }

    @Override
    public void run(String... args) throws Exception {

        Customer customer1 = new Customer("Jerry", "Larson", "12 Wharf Avenue", "12345", "111-867-5309", 8L);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Larry", "Jarson", "13 Wharf Avenue", "12346", "112-867-5309", 8L);
        customerRepository.save(customer2);

        Customer customer3 = new Customer("Gerry", "Lharson", "14 Wharf Avenue", "12347", "113-867-5309", 8L);
        customerRepository.save(customer3);

        Customer customer4 = new Customer("Merry", "Starson", "15 Wharf Avenue", "12348", "114-867-5309", 8L);
        customerRepository.save(customer4);

        Customer customer5 = new Customer("Kerry", "Blarpson", "16 Wharf Avenue", "12349", "115-867-5309", 8L);
        customerRepository.save(customer5);
    }

}
