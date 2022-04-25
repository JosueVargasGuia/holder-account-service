package com.nttdata.holder.account.service.FeignClient.FallBackImpl;

import org.springframework.stereotype.Component;

import com.nttdata.holder.account.service.FeignClient.CustomerFeignClient;
import com.nttdata.holder.account.service.model.Customer;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class CustomerFeignClientFallBack implements CustomerFeignClient{@Override
	
	
	public Customer customerfindById(Long id) {
		Customer customer = new Customer();
		customer.setId(Long.valueOf(-1));
		log.info("CustomerFeignClientFallBack -> "+ customer);
		return null;
	}

	
	
	
	
}
