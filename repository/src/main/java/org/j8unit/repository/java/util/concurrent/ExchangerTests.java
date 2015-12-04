package org.j8unit.repository.java.util.concurrent;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.util.concurrent.Exchanger class java.util.concurrent.Exchanger},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.concurrent.ExchangerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ExchangerTests<SUT extends java.util.concurrent.Exchanger<V>, V>
extends org.j8unit.repository.java.lang.ObjectTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.util.concurrent.Exchanger#exchange(java.lang.Object,long,java.util.concurrent.TimeUnit) public java.lang.Object java.util.concurrent.Exchanger.exchange(java.lang.Object,long,java.util.concurrent.TimeUnit) throws java.lang.InterruptedException,java.util.concurrent.TimeoutException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_exchange_Object_long_TimeUnit() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.concurrent.Exchanger#exchange(java.lang.Object) public java.lang.Object java.util.concurrent.Exchanger.exchange(java.lang.Object) throws java.lang.InterruptedException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_exchange_Object() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
