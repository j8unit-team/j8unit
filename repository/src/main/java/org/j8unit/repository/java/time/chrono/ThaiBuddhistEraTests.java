package org.j8unit.repository.java.time.chrono;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.time.chrono.ThaiBuddhistEra class java.time.chrono.ThaiBuddhistEra},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.time.chrono.ThaiBuddhistEraClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ThaiBuddhistEraTests<SUT extends java.time.chrono.ThaiBuddhistEra>
extends org.j8unit.repository.java.time.chrono.EraTests<SUT>,
        org.j8unit.repository.java.lang.EnumTests<SUT,java.time.chrono.ThaiBuddhistEra>
{

    /**
     * <p>
     * Test method for {@link java.time.chrono.ThaiBuddhistEra#getValue() public int java.time.chrono.ThaiBuddhistEra.getValue()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getValue() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
