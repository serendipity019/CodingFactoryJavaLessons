package gr.aueb.cf.ch19.mobile_contacts.dao;

import gr.aueb.cf.ch19.mobile_contacts.model.MobileContact;

import java.util.List;

public interface IMobileContactDAO {
    //The first 4 is ever necessary(CRUDE)
    MobileContact insert(MobileContact mobileContact);
    MobileContact update(Long id, MobileContact mobileContact);
    void deleteById(Long id);
    MobileContact getById(Long id);

    List<MobileContact> getAll(); //Is a dynamic constructor and make something like dynamic table

    void deleteByPhoneNumber(String phoneNumber);

    MobileContact getByPhoneNumber(String phoneNumber);
    boolean userIdExists(Long id);
    boolean phoneNumberExists(String phoneNumber);
}
