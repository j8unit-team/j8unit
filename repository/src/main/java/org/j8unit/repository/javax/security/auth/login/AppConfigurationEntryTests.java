package org.j8unit.repository.javax.security.auth.login;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.security.auth.login.AppConfigurationEntry class
 * javax.security.auth.login.AppConfigurationEntry}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.security.auth.login.AppConfigurationEntryClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AppConfigurationEntryTests<SUT extends javax.security.auth.login.AppConfigurationEntry>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.security.auth.login.AppConfigurationEntry$LoginModuleControlFlag class
     * javax.security.auth.login.AppConfigurationEntry$LoginModuleControlFlag}, containing all instance relevant test
     * methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.security.auth.login.AppConfigurationEntryClassTests.
     *      LoginModuleControlFlagClassTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface LoginModuleControlFlagTests<SUT extends javax.security.auth.login.AppConfigurationEntry.LoginModuleControlFlag>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.security.auth.login.AppConfigurationEntry.LoginModuleControlFlag#toString()
         * public java.lang.String javax.security.auth.login.AppConfigurationEntry$LoginModuleControlFlag.toString()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_toString()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.login.AppConfigurationEntry#getControlFlag() public
     * javax.security.auth.login.AppConfigurationEntry$LoginModuleControlFlag
     * javax.security.auth.login.AppConfigurationEntry.getControlFlag()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getControlFlag()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.login.AppConfigurationEntry#getLoginModuleName() public
     * java.lang.String javax.security.auth.login.AppConfigurationEntry.getLoginModuleName()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLoginModuleName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.login.AppConfigurationEntry#getOptions() public java.util.Map
     * javax.security.auth.login.AppConfigurationEntry.getOptions()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getOptions()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
