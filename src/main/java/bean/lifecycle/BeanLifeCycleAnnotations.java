package bean.lifecycle;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifeCycleAnnotations {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    @PostConstruct
    public void init(){
        System.out.println("BeanLifeCycleAnnotation -> Bean init() Method Called...");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("BeanLifeCycleAnnotation -> Bean destroy() Method Called...");
    }
    @Override
    public String toString() {
        return "BeanLifeCycleAnnotations{" +
                "data='" + data + '\'' +
                '}';
    }
}
