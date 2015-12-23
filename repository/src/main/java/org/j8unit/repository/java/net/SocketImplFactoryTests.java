package org.j8unit.repository.java.net;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.net.SocketImplFactory interface java.net.SocketImplFactory},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.net.SocketImplFactoryTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.net.SocketImplFactoryClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.net.SocketImplFactory
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SocketImplFactoryTests<SUT extends java.net.SocketImplFactory>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.net.SocketImplFactory#createSocketImpl() public abstract java.net.SocketImpl
     * java.net.SocketImplFactory.createSocketImpl()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.net.SocketImplFactory#createSocketImpl()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createSocketImpl()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
