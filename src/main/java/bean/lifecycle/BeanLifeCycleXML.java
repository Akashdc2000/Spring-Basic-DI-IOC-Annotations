package bean.lifecycle;

public class BeanLifeCycleXML {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("BeanLifeCycleXML Object Instantiated");
        this.name = name;
    }

    public void init() {
        System.out.println("BeanLifeCycleXML -> Bean init() method called...");
    }
    public void destroy() {
        System.out.println("BeanLifeCycleXML -> Bean destroy() Method Called...");
    }

    @Override
    public String toString() {
        return "BeanLifeCycleXML{" +
                "name='" + name + '\'' +
                '}';
    }
}
