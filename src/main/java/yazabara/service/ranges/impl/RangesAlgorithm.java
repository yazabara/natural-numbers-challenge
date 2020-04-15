package yazabara.service.ranges.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import yazabara.data.Range;
import yazabara.service.ranges.NaturalRangeAlgorithm;

import java.util.HashSet;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class RangesAlgorithm implements NaturalRangeAlgorithm {

    private Set<Range> ranges = new HashSet<>();
    private Set<Integer> source;

    @Override
    public Range process(final Set<Integer> source) {
        ranges.clear();
        this.source = source;
        calculate();
        // TODO
        return null;
    }

    private void calculate() {

        source.forEach(number -> {
            // initial step
            if (ranges.isEmpty()) {
                ranges.add(new Range(number));
                return;
            }
            boolean process = false;
            // common step
            for (Range range : ranges) {
                process = range.process(number);
            }
            // if numbers wasn't process -> create new range
            if (!process) {
                ranges.add(new Range(number));
            }
            // sync ranges (maybe there are several unions)
            syncRanges();
        });
    }

    private void syncRanges() {

    }
}
