package org.j8unit.repository.javax.security.auth;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.security.auth.Subject class javax.security.auth.Subject}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link SubjectClassTests}.
 * </p>
 *
 * @see javax.security.auth.Subject class javax.security.auth.Subject (the hereby targeted class-under-test class)
 * @see SubjectClassTests SubjectClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SubjectTests<SUT extends javax.security.auth.Subject>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.security.auth.Subject#setReadOnly() public void
     * javax.security.auth.Subject.setReadOnly()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.Subject#setReadOnly() public void
     * javax.security.auth.Subject.setReadOnly()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.Subject#setReadOnly() public void javax.security.auth.Subject.setReadOnly() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setReadOnly()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.Subject#getPublicCredentials(Class) public <T> java.util.Set
     * <T> javax.security.auth.Subject.getPublicCredentials(java.lang.Class<T>)}.
     *
     * <p>
     * Test method for {@link javax.security.auth.Subject#getPublicCredentials(Class) public java.util.Set
     * javax.security.auth.Subject.getPublicCredentials(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.Subject#getPublicCredentials(Class) public java.util.Set
     *      javax.security.auth.Subject.getPublicCredentials(java.lang.Class) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPublicCredentials_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.Subject#getPublicCredentials() public java.util.Set
     * <java.lang.Object> javax.security.auth.Subject.getPublicCredentials()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.Subject#getPublicCredentials() public java.util.Set
     * javax.security.auth.Subject.getPublicCredentials()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.Subject#getPublicCredentials() public java.util.Set
     *      javax.security.auth.Subject.getPublicCredentials() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPublicCredentials()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.Subject#toString() public java.lang.String
     * javax.security.auth.Subject.toString()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.Subject#toString() public java.lang.String
     * javax.security.auth.Subject.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.Subject#toString() public java.lang.String javax.security.auth.Subject.toString() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.Subject#getPrincipals(Class) public <T> java.util.Set
     * <T> javax.security.auth.Subject.getPrincipals(java.lang.Class<T>)}.
     *
     * <p>
     * Test method for {@link javax.security.auth.Subject#getPrincipals(Class) public java.util.Set
     * javax.security.auth.Subject.getPrincipals(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.Subject#getPrincipals(Class) public java.util.Set
     *      javax.security.auth.Subject.getPrincipals(java.lang.Class) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPrincipals_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.Subject#getPrincipals() public java.util.Set
     * <java.security.Principal> javax.security.auth.Subject.getPrincipals()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.Subject#getPrincipals() public java.util.Set
     * javax.security.auth.Subject.getPrincipals()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.Subject#getPrincipals() public java.util.Set javax.security.auth.Subject.getPrincipals()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPrincipals()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.Subject#hashCode() public int javax.security.auth.Subject.hashCode()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.Subject#hashCode() public int javax.security.auth.Subject.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.Subject#hashCode() public int javax.security.auth.Subject.hashCode() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_hashCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.Subject#equals(Object) public boolean
     * javax.security.auth.Subject.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link javax.security.auth.Subject#equals(Object) public boolean
     * javax.security.auth.Subject.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.Subject#equals(Object) public boolean
     *      javax.security.auth.Subject.equals(java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
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
     * Test method for {@link javax.security.auth.Subject#isReadOnly() public boolean
     * javax.security.auth.Subject.isReadOnly()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.Subject#isReadOnly() public boolean
     * javax.security.auth.Subject.isReadOnly()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.Subject#isReadOnly() public boolean javax.security.auth.Subject.isReadOnly() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isReadOnly()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.Subject#getPrivateCredentials() public java.util.Set
     * <java.lang.Object> javax.security.auth.Subject.getPrivateCredentials()}.
     *
     * <p>
     * Test method for {@link javax.security.auth.Subject#getPrivateCredentials() public java.util.Set
     * javax.security.auth.Subject.getPrivateCredentials()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.Subject#getPrivateCredentials() public java.util.Set
     *      javax.security.auth.Subject.getPrivateCredentials() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPrivateCredentials()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.Subject#getPrivateCredentials(Class) public <T> java.util.Set
     * <T> javax.security.auth.Subject.getPrivateCredentials(java.lang.Class<T>)}.
     *
     * <p>
     * Test method for {@link javax.security.auth.Subject#getPrivateCredentials(Class) public java.util.Set
     * javax.security.auth.Subject.getPrivateCredentials(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.security.auth.Subject#getPrivateCredentials(Class) public java.util.Set
     *      javax.security.auth.Subject.getPrivateCredentials(java.lang.Class) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPrivateCredentials_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
