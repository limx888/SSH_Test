package test;

import bean.Addresslist;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import service.Address;
import service.AddressImpl;

/**
 * Created by bocs on 2018/8/2.
 */
public class test {
    public static void main(String[] args){
        ApplicationContext ac = new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext.xml");
        TestService ts = (TestService)ac.getBean("testService");
        ts.hello();

        Address address = (AddressImpl)ac.getBean("address");
        Addresslist addresslist = new Addresslist();
        addresslist.setName("mmm");
        addresslist.setPhone("19999999999");
        address.add(addresslist);
    }
}
