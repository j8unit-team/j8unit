package org.j8unit.util;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;
import java.util.List;
import java.util.function.Function;

public enum TestDataUtil {
    ;

    public static final Function<Object, Object[]> ENVELOPE = x -> new Object[] { x };

    @SafeVarargs
    public static final <T> List<Object[]> testDataOfSingletons(final T... values) {
        return stream(values).map(ENVELOPE).collect(toList());
    }

    public static final <E extends Enum<E>> List<Object[]> testDataOf(final Class<E> enumClass) {
        assert enumClass.isEnum();
        return testDataOfSingletons(enumClass.getEnumConstants());
    }

}
