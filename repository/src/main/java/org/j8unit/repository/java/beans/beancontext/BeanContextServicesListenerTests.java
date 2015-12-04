package org.j8unit.repository.java.beans.beancontext;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.beans.beancontext.BeanContextServicesListener interface java.beans.beancontext.BeanContextServicesListener},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.beans.beancontext.BeanContextServicesListenerClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface BeanContextServicesListenerTests<SUT extends java.beans.beancontext.BeanContextServicesListener>
extends org.j8unit.repository.java.beans.beancontext.BeanContextServiceRevokedListenerTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.beans.beancontext.BeanContextServicesListener#serviceAvailable(java.beans.beancontext.BeanContextServiceAvailableEvent) public abstract void java.beans.beancontext.BeanContextServicesListener.serviceAvailable(java.beans.beancontext.BeanContextServiceAvailableEvent)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_serviceAvailable_BeanContextServiceAvailableEvent() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
