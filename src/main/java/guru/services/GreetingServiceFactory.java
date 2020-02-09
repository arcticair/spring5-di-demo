package guru.services;

public class GreetingServiceFactory {
    GreetingRepository greetingRepository;
    public GreetingServiceFactory(GreetingRepository repository) {
        this.greetingRepository = repository;
    }
    public GreetingService createGreetingService(String lang){
        switch (lang){
            case "en":
                return new PrimaryGreetingService(greetingRepository);
            case "de":
                return new PrimaryGermanGreetingService(greetingRepository);
            case "es":
                return new PrimarySpanishGreetingService(greetingRepository);
            default:
                return new PrimaryGreetingService(greetingRepository);
        }
    }
}
