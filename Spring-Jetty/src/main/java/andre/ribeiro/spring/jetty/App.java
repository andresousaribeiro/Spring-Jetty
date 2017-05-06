package andre.ribeiro.spring.jetty;

import org.springframework.boot.SpringApplication;

/**
 *
 * @author andreribeiro
 */
public class App {

    public static void main(String[] args) {
        
        SpringApplication.run(HelloWorld.class, args);
        /* Run on a other port (default 8080)
        HashMap<String, Object> props = new HashMap<>();
        props.put("server.port", 9999);
        new SpringApplicationBuilder()
                .sources(HelloWorld.class)
                .properties(props)
                .run(args);*/
    }

}
