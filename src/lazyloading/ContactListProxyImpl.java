package lazyloading;

import java.util.List;

class ContactListProxyImpl implements ContactList {
    private ContactList contactList;
    public List<Employee> getEmployeeList()
    {
        if (contactList == null) {
            System.out.println("Fetching list of employees");
            contactList = new ContactListImpl();
        }
        return contactList.getEmployeeList();
    }
}