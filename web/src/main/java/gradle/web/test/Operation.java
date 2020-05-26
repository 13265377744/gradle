package gradle.web.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: Enum type that switches on its own value - questionable
 * @Author: dingj
 * @DATA: 2020/4/30
 * @TIME: 11:31
 */
public enum Operation {


    PLUS("+") {
        double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES("*") {
        double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        double apply(double x, double y) {
            return x / y;
        }
    };
    private final String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    abstract double apply(double x, double y);

    // Implementation a fromString method on an enum type
    private static final Map<String, Operation> stringToEnum
            = new HashMap<String, Operation>();

    static {
        // Initialize map from contant name to enum constant
        for (Operation op : values())
            stringToEnum.put(op.toString(), op);
    }

    // Returns Operation for String, or null if string is invalid
    public static Operation fromString(String symbol) {
        return stringToEnum.get(symbol);
    }

}
