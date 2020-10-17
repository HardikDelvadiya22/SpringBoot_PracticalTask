package net.service;

import java.util.List;

import org.springframework.data.domain.Page;

import net.model.Customer;

public interface CustomerService {
	List<Customer> getAllCustomer();
	void saveCustomer(Customer customer);
	Customer getCustomerById(long id);
	void deleteCustomerById(long id);
	Page<Customer> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
