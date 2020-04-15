package yazabara.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import yazabara.data.Range;
import yazabara.service.ranges.impl.RangesAlgorithm;
import yazabara.service.ranges.impl.SimpleAlgorithm;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class NaturalNumbersService {

    private final RangesAlgorithm rangesAlgorithm;
    private final SimpleAlgorithm simpleAlgorithm;

    Range getMaxRange(Set<Integer> source) {
        return simpleAlgorithm.process(source);
    }
}
