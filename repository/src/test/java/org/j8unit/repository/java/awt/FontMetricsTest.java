package org.j8unit.repository.java.awt;

import java.awt.FontMetrics;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FontMetricsTest
implements org.j8unit.repository.java.awt.FontMetricsTests<FontMetrics> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.FontMetrics]

    @Override
    public FontMetrics createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.FontMetrics], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.FontMetrics]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.FontMetrics]

}
