package guru.services;

import org.springframework.stereotype.Service;

/**
 * Created by jt on 5/24/17.
 */
@Service
public class GetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - GetterGreetingService";
    }
}
