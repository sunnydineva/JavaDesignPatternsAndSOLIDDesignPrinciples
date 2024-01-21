package lazyloading;

import java.util.List;

class LazyLoading {
/*
    Lazy loading is a software design pattern where the initialization of an object occurs only when it is actually needed
    and not before to preserve simplicity of usage and improve performance.

    There are four common implementations of Lazy Loading pattern :
    Virtual proxy.
    Lazy initialization
    Ghost
    Value holder

    The Virtual Proxy pattern is a memory saving technique that recommends postponing an object creation until it is needed.
    It is used when creating an object the is expensive in terms of memory usage or processing involved.

    The Lazy Initialization technique consists of checking the value of a class field when it’s being used.
    If that value equals to null then that field gets loaded with the proper value before it is returned.

 */





    public static void main(String[] args)
    {
        ContactList contactList = new ContactListProxyImpl();
        Company company = new Company
                ("Geeksforgeeks", "India", "+91-011-28458965", contactList);

        System.out.println("Company Name: " + company.getCompanyName());
        System.out.println("Company Address: " + company.getCompanyAddress());
        System.out.println("Company Contact No.: " + company.getCompanyContactNo());
        System.out.println("Requesting for contact list");

        contactList = company.getContactList();
        List<Employee> empList = contactList.getEmployeeList();
        for (Employee emp : empList) {
            System.out.println(emp);
        }
    }
}
