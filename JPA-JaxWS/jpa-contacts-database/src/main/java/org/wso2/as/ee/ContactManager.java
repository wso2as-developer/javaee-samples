package org.wso2.as.ee;

import java.util.List;

public interface ContactManager {

    public String addContact(Contact contact);

    public List<Contact> getContacts();

}
