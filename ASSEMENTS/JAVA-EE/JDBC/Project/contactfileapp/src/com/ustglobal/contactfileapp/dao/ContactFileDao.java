package com.ustglobal.contactfileapp.dao;

import java.util.List;

import com.ustglobal.contactfileapp.dto.ContactBean;

public interface ContactFileDao {
 
	List<String> selectAllContact();
	
	ContactBean searchContact(String name);
	
	int addContact(ContactBean bean);
	int deleteContact(String name);
    int updateContact(ContactBean bean);
	
}
