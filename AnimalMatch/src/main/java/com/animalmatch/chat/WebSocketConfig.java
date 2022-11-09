//package com.animalmatch.chat;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.socket.config.annotation.EnableWebSocket;
//import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
//import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
//import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.log4j.Log4j2;
//
//@Configuration
//@RequiredArgsConstructor
//@EnableWebSocket
//@Log4j2
//public class WebSocketConfig implements WebSocketConfigurer {
//
//    private final ChatHandler chatHandler;
//
//    @Override
//    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
//    	log.info("websocket Registry : {}", registry);
//        registry.addHandler(chatHandler, "ws/chat").setAllowedOrigins("*");
//    }
//    
//    
//    
//    
//}