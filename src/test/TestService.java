package test;

/**
 * Created by bocs on 2018/8/2.
 */
public class TestService {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hello() {
        System.out.println("hello "+ getName());
    }
}
