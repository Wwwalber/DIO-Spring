package dio.security_jwt.security;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "security.config")
public class SecurityConfig {
    public static String PREFIX;// prefixo
    public static String KEY; // chava privada
    public static Long EXPIRATION;

    public void setPrefix(String prefix){
        PREFIX = prefix;
    }
    public void setKey(String key){
        KEY = key;
    }
    public void setExpiration(Long expiration){
        EXPIRATION = expiration;
    }
}