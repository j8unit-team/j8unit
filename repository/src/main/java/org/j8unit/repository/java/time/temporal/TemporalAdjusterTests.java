package org.j8unit.repository.java.time.temporal;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.time.temporal.TemporalAdjuster interface java.time.temporal.TemporalAdjuster},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.time.temporal.TemporalAdjusterClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface TemporalAdjusterTests<SUT extends java.time.temporal.TemporalAdjuster>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link java.time.temporal.TemporalAdjuster#adjustInto(java.time.temporal.Temporal) public abstract java.time.temporal.Temporal java.time.temporal.TemporalAdjuster.adjustInto(java.time.temporal.Temporal)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_adjustInto_Temporal() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
