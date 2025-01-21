package gr.aueb.cf.ch17.interfaces;

import gr.aueb.cf.ch17.interfaces.model.Customer;

public interface ICustomerDAO {
    void addCustomer(Customer customer);
    void updateCustomer(Long id, Customer customer);
    boolean removeCustomer(Long id);
    Customer getCustomerId(Long id);
    Customer getCustomerByPhoneNumber(String phoneNumber);
    Customer[] getCustomerByRegion(String region);
    Customer getCustomerByVat(String vat);
}
