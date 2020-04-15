package yazabara.data;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Range {

    /**
     * Range first element
     */
    private Integer from;
    /**
     * Range last element
     */
    private Integer to;

    public Range(Integer number) {
        process(number);
    }

    public boolean isEmpty() {
        return from == null && to == null;
    }

    public boolean process(Integer number) {
        // init [number]
        if (from == null) {
            to = number;
            from = number;
            return true;
        }
        // base logic [from, to]
        if (from - number == 1) {
            from = number;
            return true;
        }
        if (number - to == 1) {
            to = number;
            return true;
        }
        return false;
    }

    public Integer getSize() {
        if (isEmpty()) {
            return 0;
        }
        return (to - from) + 1;
    }
}
