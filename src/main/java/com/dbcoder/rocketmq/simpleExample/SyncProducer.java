package com.dbcoder.rocketmq.simpleExample;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.remoting.common.RemotingHelper;

/**
* @Description:同步发送消息
* @author: bo.dong
* @Date: 2019-01-30 20:11:13
*/
public class SyncProducer {
    public static void main(String[] args) throws Exception{
        //1.实例化一个组
        DefaultMQProducer producer = new DefaultMQProducer("please_unique_group_name");
        producer.setCreateTopicKey("AUTO_CREATE_TOPIC_KEY");
        //2.指定名称服务器地址
        producer.setNamesrvAddr("192.168.226.128:9876");
        //3.启动实例
        producer.start();
        for (int i = 0; i < 100; i++) {
            //4.创建一个消息实例，指定topic,tag,和消息体
            Message msg = new Message("TopicTest"/*Topic*/,
                    "TagA" /* Tag */,
                    ("Hello RocketMQ " +
                            i).getBytes(RemotingHelper.DEFAULT_CHARSET) /* Message body */
            );
            //5.调用发消息传递消息到其中一个broker
            SendResult sendResult = producer.send(msg);
            System.out.printf("%s%n", sendResult);
        }
        //6.生产者实例不再使用后关闭
        producer.shutdown();

    }
}
