package lk.ijse.git.service;

import lk.ijse.git.dto.CustomerDTO;

import java.util.ArrayList;

public interface CustomerService {
    public ArrayList<CustomerDTO> getAllCustomers();

    public CustomerDTO getCustomer(String customerName);

    public boolean deleteCustomer(String customerName);

    public boolean saveCustomer(CustomerDTO customerDTO);
}
