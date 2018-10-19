package lk.ijse.git.service.impl;

import lk.ijse.git.dto.CustomerDTO;
import lk.ijse.git.entity.Customer;
import lk.ijse.git.repository.CustomerRepository;
import lk.ijse.git.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public ArrayList<CustomerDTO> getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();

        ArrayList<CustomerDTO> alCustomers = new ArrayList<>();
        for (Customer customer: customers) {
            CustomerDTO customerDTO = new CustomerDTO(customer.getCustomerName(),
                    customer.getAdress(),
                    customer.getContact(),
                    customer.getMail());
            alCustomers.add(customerDTO);
        }
        return alCustomers;
    }

    @Override
    public CustomerDTO getCustomer(String customerName) {
        Customer customer = customerRepository.findById(customerName).get();
        CustomerDTO customerDTO = new CustomerDTO(customer.getCustomerName(),
                customer.getAdress(),
                customer.getContact(),
                customer.getMail());
        return customerDTO;
    }

    @Override
    public boolean deleteCustomer(String customerName) {
        customerRepository.deleteById(customerName);
        return true;
    }

    @Override
    public boolean saveCustomer(CustomerDTO customerDTO) {
        Customer customer = new Customer(customerDTO.getCustomerName(),
                customerDTO.getAdress(),
                customerDTO.getContact(),
                customerDTO.getMail());
        customerRepository.save(customer);
        return true;
    }
}
