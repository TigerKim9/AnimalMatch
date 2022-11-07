package com.animalmatch.chat;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Configuration
@RequiredArgsConstructor
@EnableWebSocket
@Log4j2
public class WebSocketConfig implements WebSocketConfigurer {

    private final ChatHandler chatHandler;

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
    	log.info("websocket Registry : {}", registry);
        registry.addHandler(chatHandler, "ws/chat").setAllowedOrigins("*");
    }
    
    
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws/chat2").withSockJS();
        /*
        * withSockJS()
        * 는 웹소켓을 지원하지 않는 브라우저에
        * 폴백 옵션을 활성화하는데 사용됩니다.
        * */
    }
    
}