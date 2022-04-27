package com.nttdata.holder.account.service.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Account {

	private Long idAccount;
	private Long idProduct;
	private Long idCustomer;
	
}