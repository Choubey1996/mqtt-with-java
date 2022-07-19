package com.Device;

import org.springframework.integration.annotation.MessagingGateway;

import org.springframework.integration.mqtt.support.MqttHeaders;
import org.springframework.messaging.handler.annotation.Header;

// interface for message gateway transmission
@MessagingGateway(defaultRequestChannel="mqttOutboundChannel")
public interface Gateway {
//method -send 
	
	void sentoMqtt(String data,@Header(MqttHeaders.TOPIC) String topic);

}
