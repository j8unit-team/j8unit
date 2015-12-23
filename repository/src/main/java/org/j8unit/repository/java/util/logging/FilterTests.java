package org.j8unit.repository.java.util.logging;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.logging.Filter interface java.util.logging.Filter},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.util.logging.FilterTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.util.logging.FilterClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.logging.Filter
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FilterTests<SUT extends java.util.logging.Filter>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.logging.Filter#isLoggable(java.util.logging.LogRecord) public abstract boolean
     * java.util.logging.Filter.isLoggable(java.util.logging.LogRecord)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.logging.Filter#isLoggable(java.util.logging.LogRecord)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isLoggable_LogRecord()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
