package org.j8unit.repository.javax.security.auth.login;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.security.auth.login.Configuration class javax.security.auth.login.Configuration},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.security.auth.login.ConfigurationClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ConfigurationTests<SUT extends javax.security.auth.login.Configuration>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.security.auth.login.Configuration$Parameters interface
     * javax.security.auth.login.Configuration$Parameters}, containing all instance relevant test methods (i.&thinsp;e.,
     * test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.security.auth.login.ConfigurationClassTests.ParametersClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ParametersTests<SUT extends javax.security.auth.login.Configuration.Parameters>
    extends J8UnitTest<SUT> {

    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.login.Configuration#getAppConfigurationEntry(java.lang.String) public
     * abstract javax.security.auth.login.AppConfigurationEntry[]
     * javax.security.auth.login.Configuration.getAppConfigurationEntry(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAppConfigurationEntry_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.login.Configuration#getParameters() public
     * javax.security.auth.login.Configuration$Parameters javax.security.auth.login.Configuration.getParameters()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getParameters()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.login.Configuration#getProvider() public java.security.Provider
     * javax.security.auth.login.Configuration.getProvider()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getProvider()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.login.Configuration#getType() public java.lang.String
     * javax.security.auth.login.Configuration.getType()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.login.Configuration#refresh() public void
     * javax.security.auth.login.Configuration.refresh()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_refresh()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
