package com.lxr.iot.mqtt;

import io.netty.channel.Channel;
import io.netty.handler.codec.mqtt.*;

/**
 * 抽象出服务端事件
 *
 * @author lxr
 * @create 2018-01-03 16:11
 **/
public abstract class ServerMqttHandler  implements MqttHandlerIntf {


    public abstract boolean login(Channel channel, MqttConnectMessage mqttConnectMessage);

    public abstract  void  publish(Channel channel, MqttPublishMessage mqttPublishMessage);

    public abstract void subscribe(Channel channel, MqttSubscribeMessage mqttSubscribeMessage);


    public abstract void pong(Channel channel);

    public abstract  void unsubscribe(Channel channel, MqttUnsubscribeMessage mqttMessage);

    public abstract  void replyLogin(Channel channel, MqttConnectMessage mqttConnectMessage);

    public abstract void disconnect(Channel channel, MqttMessage mqttMessage);
}

