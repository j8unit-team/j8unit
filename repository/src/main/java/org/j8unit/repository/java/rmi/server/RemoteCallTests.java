package org.j8unit.repository.java.rmi.server;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.rmi.server.RemoteCall interface java.rmi.server.RemoteCall}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link RemoteCallClassTests}.
 * </p>
 *
 * @see java.rmi.server.RemoteCall interface java.rmi.server.RemoteCall (the hereby targeted class-under-test class)
 * @see RemoteCallClassTests RemoteCallClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface RemoteCallTests<SUT extends java.rmi.server.RemoteCall>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.rmi.server.RemoteCall#getInputStream() public abstract java.io.ObjectInput
     * java.rmi.server.RemoteCall.getInputStream() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.rmi.server.RemoteCall#getInputStream() public abstract java.io.ObjectInput
     * java.rmi.server.RemoteCall.getInputStream() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.server.RemoteCall#getInputStream() public abstract java.io.ObjectInput
     *      java.rmi.server.RemoteCall.getInputStream() throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.server.RemoteCall#done() public abstract void java.rmi.server.RemoteCall.done()
     * throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.rmi.server.RemoteCall#done() public abstract void java.rmi.server.RemoteCall.done()
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.server.RemoteCall#done() public abstract void java.rmi.server.RemoteCall.done() throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_done()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.server.RemoteCall#releaseInputStream() public abstract void
     * java.rmi.server.RemoteCall.releaseInputStream() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.rmi.server.RemoteCall#releaseInputStream() public abstract void
     * java.rmi.server.RemoteCall.releaseInputStream() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.server.RemoteCall#releaseInputStream() public abstract void
     *      java.rmi.server.RemoteCall.releaseInputStream() throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_releaseInputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.server.RemoteCall#releaseOutputStream() public abstract void
     * java.rmi.server.RemoteCall.releaseOutputStream() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.rmi.server.RemoteCall#releaseOutputStream() public abstract void
     * java.rmi.server.RemoteCall.releaseOutputStream() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.server.RemoteCall#releaseOutputStream() public abstract void
     *      java.rmi.server.RemoteCall.releaseOutputStream() throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_releaseOutputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.server.RemoteCall#getOutputStream() public abstract java.io.ObjectOutput
     * java.rmi.server.RemoteCall.getOutputStream() throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.rmi.server.RemoteCall#getOutputStream() public abstract java.io.ObjectOutput
     * java.rmi.server.RemoteCall.getOutputStream() throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.server.RemoteCall#getOutputStream() public abstract java.io.ObjectOutput
     *      java.rmi.server.RemoteCall.getOutputStream() throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getOutputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.server.RemoteCall#getResultStream(boolean) public abstract java.io.ObjectOutput
     * java.rmi.server.RemoteCall.getResultStream(boolean) throws java.io.IOException,java.io.StreamCorruptedException}.
     *
     * <p>
     * Test method for {@link java.rmi.server.RemoteCall#getResultStream(boolean) public abstract java.io.ObjectOutput
     * java.rmi.server.RemoteCall.getResultStream(boolean) throws java.io.IOException,java.io.StreamCorruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.server.RemoteCall#getResultStream(boolean) public abstract java.io.ObjectOutput
     *      java.rmi.server.RemoteCall.getResultStream(boolean) throws
     *      java.io.IOException,java.io.StreamCorruptedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getResultStream_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.rmi.server.RemoteCall#executeCall() public abstract void
     * java.rmi.server.RemoteCall.executeCall() throws java.lang.Exception}.
     *
     * <p>
     * Test method for {@link java.rmi.server.RemoteCall#executeCall() public abstract void
     * java.rmi.server.RemoteCall.executeCall() throws java.lang.Exception}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.rmi.server.RemoteCall#executeCall() public abstract void java.rmi.server.RemoteCall.executeCall()
     *      throws java.lang.Exception (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_executeCall()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
