package guru.services;

import org.springframework.stereotype.Service;

/**
 * Created by jt on 5/24/17.
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "GreetingServiceImpl";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
