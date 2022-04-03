package com.lywhxy.mapper;

import java.util.List;
import com.lywhxy.pojo.Customer;

public interface CustomerMapper {
	List<Customer> selectCustomers(Customer customer);
}
