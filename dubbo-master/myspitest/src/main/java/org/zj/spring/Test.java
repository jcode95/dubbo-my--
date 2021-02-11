package org.zj.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zj.spring.config.MyApplicationConfig;

/**
 * @author jiezhou
 * @CalssName: Test
 * @Package org.buptdavid.datastructure.zj.spring
 * @Description:
 * @date 2021/2/10/18:50
 */

public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/myspring.xml");
        MyApplicationConfig bean = context.getBean("0001", MyApplicationConfig.class);
        System.out.println(bean.getName());
    }




}
