package org.j8unit.repository.javax.naming.spi;

import javax.naming.spi.ObjectFactory;
import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link ObjectFactory
 * public abstract interface javax.naming.spi.ObjectFactory}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.naming.spi.ObjectFactoryClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ObjectFactoryTests<SUT extends ObjectFactory>
extends RepositoryTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.spi.ObjectFactory]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.naming.spi.ObjectFactory#getObjectInstance(Object, javax.naming.Name, javax.naming.Context, java.util.Hashtable)
     * public abstract java.lang.Object
     * javax.naming.spi.ObjectFactory.getObjectInstance(java.lang.Object,javax.naming.Name,javax.naming.Context,java.util.Hashtable<?,
     * ?>) throws java.lang.Exception}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getObjectInstance_Object_Name_Context_Hashtable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.spi.ObjectFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.spi.ObjectFactory]

}
