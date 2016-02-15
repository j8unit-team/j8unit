package org.j8unit.repository.javax.naming.spi;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.naming.spi.StateFactory interface javax.naming.spi.StateFactory}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link StateFactoryClassTests}.
 * </p>
 *
 * @see javax.naming.spi.StateFactory interface javax.naming.spi.StateFactory (the hereby targeted class-under-test
 *      class)
 * @see StateFactoryClassTests StateFactoryClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StateFactoryTests<SUT extends javax.naming.spi.StateFactory>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.naming.spi.StateFactory#getStateToBind(Object, javax.naming.Name, javax.naming.Context, java.util.Hashtable)
     * public abstract java.lang.Object
     * javax.naming.spi.StateFactory.getStateToBind(java.lang.Object,javax.naming.Name,javax.naming.Context,java.util.Hashtable<?,
     * ?>) throws javax.naming.NamingException}.
     *
     * <p>
     * Test method for
     * {@link javax.naming.spi.StateFactory#getStateToBind(Object, javax.naming.Name, javax.naming.Context, java.util.Hashtable)
     * public abstract java.lang.Object
     * javax.naming.spi.StateFactory.getStateToBind(java.lang.Object,javax.naming.Name,javax.naming.Context,java.util.Hashtable)
     * throws javax.naming.NamingException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.naming.spi.StateFactory#getStateToBind(Object, javax.naming.Name, javax.naming.Context,
     *      java.util.Hashtable) public abstract java.lang.Object
     *      javax.naming.spi.StateFactory.getStateToBind(java.lang.Object,javax.naming.Name,javax.naming.Context,java.
     *      util.Hashtable) throws javax.naming.NamingException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStateToBind_Object_Name_Context_Hashtable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
