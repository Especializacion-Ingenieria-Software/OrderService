package co.edu.itm.restaurant.orders.domain.repositories;


import co.edu.itm.restaurant.orders.domain.entities.Customer;
import co.edu.itm.restaurant.orders.infraestructure.persistence.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerRepository {

    @Autowired
    private ICustomerRepository customerRepository;

    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }


}
