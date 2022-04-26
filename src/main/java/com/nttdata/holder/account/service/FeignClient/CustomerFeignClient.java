package com.nttdata.holder.account.service.FeignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.nttdata.holder.account.service.FeignClient.FallBackImpl.CustomerFeignClientFallBack;
import com.nttdata.holder.account.service.model.Customer;

@FeignClient(name="${api.customer-service.uri}",
fallback = CustomerFeignClientFallBack.class)
public interface CustomerFeignClient {
	
	@GetMapping("/{id}")
	Customer customerfindById(@PathVariable("id")Long id);

}
