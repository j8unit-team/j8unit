package org.j8unit.repository.java.beans;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.beans.ExceptionListener interface java.beans.ExceptionListener},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.beans.ExceptionListenerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ExceptionListenerTests<SUT extends java.beans.ExceptionListener>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link java.beans.ExceptionListener#exceptionThrown(java.lang.Exception) public abstract void java.beans.ExceptionListener.exceptionThrown(java.lang.Exception)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_exceptionThrown_Exception() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
