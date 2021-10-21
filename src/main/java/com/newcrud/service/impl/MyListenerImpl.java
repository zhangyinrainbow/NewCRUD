package com.newcrud.service.impl;

import com.newcrud.entity.MyListenerEntity;
import com.newcrud.event.MyEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MyListenerImpl {
    @Autowired
    ApplicationContext applicationContext;
    public MyListenerEntity getMyListenerEntity(){
        MyListenerEntity myListenerEntity =new MyListenerEntity();
        myListenerEntity.setName("zhangsan");
        myListenerEntity.setId(1);
        MyEvent myEvent = new MyEvent(this,myListenerEntity);
        // 发布事件
        applicationContext.publishEvent(myEvent);
        log.info("触发器被触发");
        return myListenerEntity;
    }
}
