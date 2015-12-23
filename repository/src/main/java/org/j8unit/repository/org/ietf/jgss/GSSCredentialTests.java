package org.j8unit.repository.org.ietf.jgss;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.ietf.jgss.GSSCredential interface org.ietf.jgss.GSSCredential},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.ietf.jgss.GSSCredentialTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.ietf.jgss.GSSCredentialClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.ietf.jgss.GSSCredential
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface GSSCredentialTests<SUT extends org.ietf.jgss.GSSCredential>
extends org.j8unit.repository.java.lang.CloneableTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSCredential#add(org.ietf.jgss.GSSName, int, int, org.ietf.jgss.Oid, int)
     * public abstract void org.ietf.jgss.GSSCredential.add(org.ietf.jgss.GSSName,int,int,org.ietf.jgss.Oid,int) throws
     * org.ietf.jgss.GSSException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.ietf.jgss.GSSCredential#add(org.ietf.jgss.GSSName, int, int, org.ietf.jgss.Oid, int)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_add_GSSName_int_int_Oid_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSCredential#dispose() public abstract void
     * org.ietf.jgss.GSSCredential.dispose() throws org.ietf.jgss.GSSException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.ietf.jgss.GSSCredential#dispose()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_dispose()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSCredential#equals(java.lang.Object) public abstract boolean
     * org.ietf.jgss.GSSCredential.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.ietf.jgss.GSSCredential#equals(java.lang.Object)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_equals_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSCredential#getMechs() public abstract org.ietf.jgss.Oid[]
     * org.ietf.jgss.GSSCredential.getMechs() throws org.ietf.jgss.GSSException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.ietf.jgss.GSSCredential#getMechs()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMechs()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSCredential#getName() public abstract org.ietf.jgss.GSSName
     * org.ietf.jgss.GSSCredential.getName() throws org.ietf.jgss.GSSException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.ietf.jgss.GSSCredential#getName()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSCredential#getName(org.ietf.jgss.Oid) public abstract
     * org.ietf.jgss.GSSName org.ietf.jgss.GSSCredential.getName(org.ietf.jgss.Oid) throws org.ietf.jgss.GSSException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.ietf.jgss.GSSCredential#getName(org.ietf.jgss.Oid)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getName_Oid()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSCredential#getRemainingAcceptLifetime(org.ietf.jgss.Oid) public abstract
     * int org.ietf.jgss.GSSCredential.getRemainingAcceptLifetime(org.ietf.jgss.Oid) throws org.ietf.jgss.GSSException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.ietf.jgss.GSSCredential#getRemainingAcceptLifetime(org.ietf.jgss.Oid)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRemainingAcceptLifetime_Oid()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSCredential#getRemainingInitLifetime(org.ietf.jgss.Oid) public abstract
     * int org.ietf.jgss.GSSCredential.getRemainingInitLifetime(org.ietf.jgss.Oid) throws org.ietf.jgss.GSSException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.ietf.jgss.GSSCredential#getRemainingInitLifetime(org.ietf.jgss.Oid)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRemainingInitLifetime_Oid()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSCredential#getRemainingLifetime() public abstract int
     * org.ietf.jgss.GSSCredential.getRemainingLifetime() throws org.ietf.jgss.GSSException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.ietf.jgss.GSSCredential#getRemainingLifetime()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRemainingLifetime()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSCredential#getUsage() public abstract int
     * org.ietf.jgss.GSSCredential.getUsage() throws org.ietf.jgss.GSSException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.ietf.jgss.GSSCredential#getUsage()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getUsage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSCredential#getUsage(org.ietf.jgss.Oid) public abstract int
     * org.ietf.jgss.GSSCredential.getUsage(org.ietf.jgss.Oid) throws org.ietf.jgss.GSSException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.ietf.jgss.GSSCredential#getUsage(org.ietf.jgss.Oid)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getUsage_Oid()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.ietf.jgss.GSSCredential#hashCode() public abstract int
     * org.ietf.jgss.GSSCredential.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.ietf.jgss.GSSCredential#hashCode()
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_hashCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
