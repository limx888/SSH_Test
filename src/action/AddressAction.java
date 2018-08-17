package action;

import bean.Addresslist;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import service.AddressImpl;

public class AddressAction extends ActionSupport {
    private String name;
    private String phone;

    @Autowired
    private AddressImpl address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public AddressImpl getAddress() {
        return address;
    }

    public void setAddress(AddressImpl address) {
        this.address = address;
    }

    public String add()
    {
        Addresslist al = new Addresslist();
        al.setName(getName());
        al.setPhone(getPhone());
        address.add(al);
        return SUCCESS;
    }
}
