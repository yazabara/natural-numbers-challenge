package yazabara.service.ranges.impl;

import org.springframework.stereotype.Component;
import yazabara.data.Range;
import yazabara.service.ranges.NaturalRangeAlgorithm;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class SimpleAlgorithm implements NaturalRangeAlgorithm {

    @Override
    public Range process(Set<Integer> source) {
        List<Integer> sorted = source
                .stream()
                .sorted()
                .collect(Collectors.toList());

        return findBiggestRange(sorted);
    }

    private Range findBiggestRange(List<Integer> sorted) {
        Range biggest = new Range(null);
        Range current = new Range(null);

        for (Integer integer : sorted) {
            boolean process = current.process(integer);
            // process stopped for current
            if (!process) {
                if (current.getSize() > biggest.getSize()) {
                    biggest = current;
                }
                current = new Range(integer);
            }

        }
        return current.getSize() > biggest.getSize() ? current : biggest;
    }
}
