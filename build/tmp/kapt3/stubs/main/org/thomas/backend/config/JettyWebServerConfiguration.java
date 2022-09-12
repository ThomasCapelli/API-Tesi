package org.thomas.backend.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0017\u00a8\u0006\u0006"}, d2 = {"Lorg/thomas/backend/config/JettyWebServerConfiguration;", "", "()V", "jettyServletWebServerFactory", "Lorg/springframework/boot/web/embedded/jetty/JettyServletWebServerFactory;", "Companion", "mini-api"})
@org.springframework.context.annotation.Configuration
public class JettyWebServerConfiguration {
    @org.jetbrains.annotations.NotNull
    public static final org.thomas.backend.config.JettyWebServerConfiguration.Companion Companion = null;
    private static final int MIN_BYTES = 1;
    
    public JettyWebServerConfiguration() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @org.springframework.context.annotation.Bean
    public org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory jettyServletWebServerFactory() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/thomas/backend/config/JettyWebServerConfiguration$Companion;", "", "()V", "MIN_BYTES", "", "mini-api"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}