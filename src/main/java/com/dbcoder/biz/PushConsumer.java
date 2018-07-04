package com.dbcoder.biz;

import com.alibaba.rocketmq.client.consumer.DefaultMQPullConsumer;
import com.alibaba.rocketmq.client.consumer.DefaultMQPushConsumer;
import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import com.alibaba.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.client.producer.DefaultMQProducer;
import com.alibaba.rocketmq.common.message.MessageExt;

import java.util.List;

public class PushConsumer {
    /**
     * 内部是使用长轮询Pull方式从MetaQ服务器拉消息，然后再回调用户Listener方法<br>
     */
    public static void main(String[] args) throws InterruptedException,MQClientException{
        DefaultMQPushConsumer consumer=new DefaultMQPushConsumer("ConsumerGroupName");
        consumer.setNamesrvAddr("192.168.1.XXX:9876");//todo 安装rocketmq替换ip
        consumer.setInstanceName("Consumber");
        consumer.subscribe("TopicTest1","TagA||TagC||TagD");
        consumer.subscribe("TopicTest2","*");
        consumer.registerMessageListener(new MessageListenerConcurrently() {
            @Override
            public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list, ConsumeConcurrentlyContext consumeConcurrentlyContext) {
                System.out.println(Thread.currentThread().getName()+" Receive New Messages: "+list.size());
                MessageExt msg=list.get(0);
                if(msg.getTopic().equals("TopicTest1")){
                    if(msg.getTopic()!=null&&msg.getTags().equals("TagA")){

                    }else if(msg.getTags()!=null&&msg.getTags().equals("TagC")){

                    }else if(msg.getTags()!=null&&msg.getTags().equals("TagD")){

                    }
                }else if(msg.getTopic().equals("TopicTest2")){
                    System.out.println(new String(msg.getBody()));
                }
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
        });
        consumer.start();
        System.out.println("Consumer Started.");
    }
}
