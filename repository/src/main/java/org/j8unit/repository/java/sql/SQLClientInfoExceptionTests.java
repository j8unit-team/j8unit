package org.j8unit.repository.java.sql;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.sql.SQLClientInfoException class java.sql.SQLClientInfoException},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.sql.SQLClientInfoExceptionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface SQLClientInfoExceptionTests<SUT extends java.sql.SQLClientInfoException>
extends org.j8unit.repository.java.sql.SQLExceptionTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.sql.SQLClientInfoException#getFailedProperties() public java.util.Map java.sql.SQLClientInfoException.getFailedProperties()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFailedProperties() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
