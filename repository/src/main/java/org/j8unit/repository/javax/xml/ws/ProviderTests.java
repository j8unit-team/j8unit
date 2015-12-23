package org.j8unit.repository.javax.xml.ws;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.ws.Provider interface javax.xml.ws.Provider}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is {@link org.j8unit.repository.javax.xml.ws.ProviderTests}
 * .
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.ws.ProviderClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.ws.Provider
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ProviderTests<SUT extends javax.xml.ws.Provider<T>, T>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.ws.Provider#invoke(java.lang.Object) public abstract java.lang.Object
     * javax.xml.ws.Provider.invoke(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.xml.ws.Provider#invoke(java.lang.Object)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_invoke_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
