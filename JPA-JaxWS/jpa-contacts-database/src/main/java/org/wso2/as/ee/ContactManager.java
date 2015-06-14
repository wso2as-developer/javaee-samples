package org.wso2.as.ee;

import java.util.List;

public interface ContactManager {

    public String addContact(Contact contact) throws Exception;

    public List<Contact> getContacts();

}
