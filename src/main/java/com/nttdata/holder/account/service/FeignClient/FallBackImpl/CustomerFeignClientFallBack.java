package com.nttdata.holder.account.service.FeignClient.FallBackImpl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.nttdata.holder.account.service.FeignClient.CustomerFeignClient;
import com.nttdata.holder.account.service.model.Customer;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class CustomerFeignClientFallBack implements CustomerFeignClient {
	@Value("${api.customer-service.uri}")
	private String customerService;

	public Customer customerfindById(Long id) {
		// Customer customer = new Customer();
		// customer.setId(Long.valueOf(-1));
		log.info("CustomerFeignClientFallBack -> " + customerService);
		return null;
	}

}
