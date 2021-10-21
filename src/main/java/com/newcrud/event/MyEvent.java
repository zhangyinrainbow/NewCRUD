package com.newcrud.event;

import com.newcrud.entity.MyListenerEntity;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;
@Getter
public class MyEvent extends ApplicationEvent {
    private MyListenerEntity myListenerEntity;
    /**
     * 重写构造函数
     *
     * @param source   发生事件的对象
     * @param myListenerEntity 注册用户对象
     */
    public MyEvent(Object source, MyListenerEntity myListenerEntity) {
        super(source);
        this.myListenerEntity=myListenerEntity;
    }
}
