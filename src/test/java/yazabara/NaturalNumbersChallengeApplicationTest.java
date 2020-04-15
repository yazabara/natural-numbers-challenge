package yazabara;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import yazabara.service.NaturalNumbersService;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class NaturalNumbersChallengeApplicationTest {

    @Autowired
    private NaturalNumbersService naturalNumbersService;

    @Test
    @DisplayName("Test Spring @Autowired injection works")
    void injectionWorks() {
        assertNotNull(naturalNumbersService);
    }
}