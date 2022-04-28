package com.nttdata.holder.account.service.FeignClient.FallBackImpl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.nttdata.holder.account.service.FeignClient.AccountFeignClient;
import com.nttdata.holder.account.service.model.BankAccounts;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class AccountFeignClientFallBack implements AccountFeignClient{

	@Value("${api.account-service.uri}")
	private String accountService;
	
	@Override
	public BankAccounts accountFindById(Long id) {
		log.info("AccountFeignClientFallBack -> " + accountService);
		return null;
	}
}
