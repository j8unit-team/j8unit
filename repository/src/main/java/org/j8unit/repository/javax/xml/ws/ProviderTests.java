package org.j8unit.repository.javax.xml.ws;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.xml.ws.Provider interface javax.xml.ws.Provider},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.ws.ProviderClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ProviderTests<SUT extends javax.xml.ws.Provider<T>, T>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.xml.ws.Provider#invoke(java.lang.Object) public abstract java.lang.Object javax.xml.ws.Provider.invoke(java.lang.Object)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_invoke_Object() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
