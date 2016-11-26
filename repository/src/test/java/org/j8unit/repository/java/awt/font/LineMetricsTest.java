package org.j8unit.repository.java.awt.font;

import java.awt.font.LineMetrics;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link LineMetrics} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.font.LineMetricsTests}).
 */
@RunWith(J8Unit4.class)
public class LineMetricsTest
implements LineMetricsTests<LineMetrics> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.font.LineMetrics]

    @Override
    public LineMetrics createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.font.LineMetrics], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.font.LineMetrics]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.font.LineMetrics]

}
