package org.j8unit.generator.api;

import static java.lang.String.format;
import org.j8unit.generator.analysis.AccessScope;

public abstract interface GeneratorMarkers {

    public static final String J8UNIT_BEGIN_MARKER = "J8UNIT MARKER";

    public static final String J8UNIT_END_MARKER = "J8UNIT MARKER";

    public static final String BEGIN_OF_TESTS = "Begin of Test Execution of Current Type-Under-Test";

    public static final String BEGIN_OF_TYPE_UNDER_TEST = "Begin of Inheritable Test Methods of Current Type-Under-Test";

    public static final String END_OF_TYPE_UNDER_TEST = "End of Inheritable Test Methods of Current Type-Under-Test";

    public static final String END_OF_TESTS = "End of Test Execution of Current Type-Under-Test";

    public static enum Position {
        BEGIN,
        END;
    }

    public default String marker(final Position position, final AccessScope scope, final Class<?> type) {
        return format("J8UNIT-MARKER-[%s]-[%s]-[%s]", position.name(), scope.name(), type.getName());
    }

    public default String marker(final Position position, final ModusOperandi moop, final Class<?> type) {
        return marker(position, moop.getAccessScope(), type);
    }

}
