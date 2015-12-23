package org.j8unit.repository.java.util;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.Formattable interface java.util.Formattable}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is {@link org.j8unit.repository.java.util.FormattableTests}
 * .
 * </p>
 *
 * @see org.j8unit.repository.java.util.FormattableClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.Formattable
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FormattableTests<SUT extends java.util.Formattable>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.Formattable#formatTo(java.util.Formatter, int, int, int) public abstract void
     * java.util.Formattable.formatTo(java.util.Formatter,int,int,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.util.Formattable#formatTo(java.util.Formatter, int, int, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_formatTo_Formatter_int_int_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
