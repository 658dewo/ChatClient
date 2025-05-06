package com.example.chatclient.util;

import com.example.chatclient.model.Message;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static Message parseMessage(byte[] bytes) throws Exception {
        return mapper.readValue(bytes, Message.class);//传入字节数组，返回Message对象
    }

    public static byte[] serializeMessage(Message message) throws Exception {
        return mapper.writeValueAsBytes(message);
    }
}