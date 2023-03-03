package bean.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycleInterface implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        //destroy()
        System.out.println("BeanLifeCycleInterface -> Bean destroy() Method Called...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        //init ()
        System.out.println("BeanLifeCycleInterface -> Bean init() Method Called...");

    }
}
