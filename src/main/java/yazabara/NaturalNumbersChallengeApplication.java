package yazabara;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@RequiredArgsConstructor
@SpringBootApplication
public class NaturalNumbersChallengeApplication implements CommandLineRunner {

    public static void main(String[] args) {
        log.info("Starting the application");
        SpringApplication.run(NaturalNumbersChallengeApplication.class, args);
        log.info("application finished");
    }

    @Override
    public void run(String... args) {
        log.info("TADA");
    }
}
