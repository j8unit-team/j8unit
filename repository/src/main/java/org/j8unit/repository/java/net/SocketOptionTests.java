package org.j8unit.repository.java.net;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.net.SocketOption interface java.net.SocketOption}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link SocketOptionClassTests}.
 * </p>
 *
 * @see java.net.SocketOption interface java.net.SocketOption (the hereby targeted class-under-test class)
 * @see SocketOptionClassTests SocketOptionClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SocketOptionTests<SUT extends java.net.SocketOption<T>, T>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.net.SocketOption#type() public abstract java.lang.Class
     * <T> java.net.SocketOption.type()}.
     *
     * <p>
     * Test method for {@link java.net.SocketOption#type() public abstract java.lang.Class java.net.SocketOption.type()}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.SocketOption#type() public abstract java.lang.Class java.net.SocketOption.type() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_type()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.net.SocketOption#name() public abstract java.lang.String
     * java.net.SocketOption.name()}.
     *
     * <p>
     * Test method for {@link java.net.SocketOption#name() public abstract java.lang.String
     * java.net.SocketOption.name()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.net.SocketOption#name() public abstract java.lang.String java.net.SocketOption.name() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_name()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
