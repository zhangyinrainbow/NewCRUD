package com.newcrud.config;

import com.newcrud.entity.MyListenerEntity;
import com.newcrud.event.MyEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
//使用Compent将这个监听器交给Spring容器来加载
@Slf4j
public class MyListener implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent myEvent) {
        //将事件中的信息获取到
        MyListenerEntity myListenerEntity=myEvent.getMyListenerEntity();
        log.info(myListenerEntity.getName());
        log.info(String.valueOf(myListenerEntity.getId()));
    }
}
