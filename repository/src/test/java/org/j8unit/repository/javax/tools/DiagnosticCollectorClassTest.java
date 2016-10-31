package org.j8unit.repository.javax.tools;

import javax.tools.DiagnosticCollector;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class DiagnosticCollectorClassTest
implements org.j8unit.repository.javax.tools.DiagnosticCollectorClassTests<DiagnosticCollector> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.tools.DiagnosticCollector]

    @Override
    public Class<DiagnosticCollector> createNewSUT() {
        return DiagnosticCollector.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.tools.DiagnosticCollector#DiagnosticCollector() public javax.tools.DiagnosticCollector()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_DiagnosticCollector()
    throws Exception {
        // create new instance
        final DiagnosticCollector sut = new DiagnosticCollector();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.tools.DiagnosticCollector]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.tools.DiagnosticCollector]

}
