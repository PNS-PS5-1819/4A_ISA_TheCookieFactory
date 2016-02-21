package fr.unice.polytech.isa.tcf.webservice;

import fr.unice.polytech.isa.tcf.entities.Item;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.Set;

@WebService
public interface CartWebService {

	@WebMethod
	void addItemToCustomerCart(@WebParam(name = "customer_name") String customerName,
							   @WebParam(name = "item") Item it);

	@WebMethod
	@WebResult(name = "cart_contents")
	Set<Item> getCustomerCartContents(@WebParam(name = "customer_name") String customerName);

}