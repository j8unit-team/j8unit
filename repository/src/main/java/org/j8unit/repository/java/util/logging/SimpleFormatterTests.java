package org.j8unit.repository.java.util.logging;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.logging.SimpleFormatter class
 * java.util.logging.SimpleFormatter}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.util.logging.SimpleFormatterTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.util.logging.SimpleFormatterClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.logging.SimpleFormatter
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SimpleFormatterTests<SUT extends java.util.logging.SimpleFormatter>
extends org.j8unit.repository.java.util.logging.FormatterTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.logging.SimpleFormatter#format(java.util.logging.LogRecord) public synchronized
     * java.lang.String java.util.logging.SimpleFormatter.format(java.util.logging.LogRecord)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.logging.SimpleFormatter#format(java.util.logging.LogRecord)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_format_LogRecord()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
