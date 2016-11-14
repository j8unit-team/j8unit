package org.j8unit.repository.java.awt;

import java.awt.FontMetrics;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link FontMetrics} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.FontMetricsClassTests}).
 */

@RunWith(J8Unit4.class)
public class FontMetricsClassTest
implements FontMetricsClassTests<FontMetrics> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.FontMetrics]

    @Override
    public Class<FontMetrics> createNewSUT() {
        return FontMetrics.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.FontMetrics]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.FontMetrics]

}
