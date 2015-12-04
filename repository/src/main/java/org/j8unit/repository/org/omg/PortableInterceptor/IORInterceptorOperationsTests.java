package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link org.omg.PortableInterceptor.IORInterceptorOperations interface org.omg.PortableInterceptor.IORInterceptorOperations},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.PortableInterceptor.IORInterceptorOperationsClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface IORInterceptorOperationsTests<SUT extends org.omg.PortableInterceptor.IORInterceptorOperations>
extends org.j8unit.repository.org.omg.PortableInterceptor.InterceptorOperationsTests<SUT>
{

    /**
     * <p>
     * Test method for {@link org.omg.PortableInterceptor.IORInterceptorOperations#establish_components(org.omg.PortableInterceptor.IORInfo) public abstract void org.omg.PortableInterceptor.IORInterceptorOperations.establish_components(org.omg.PortableInterceptor.IORInfo)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_establish_components_IORInfo() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
