package org.j8unit.repository.javax.security.auth.login;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.security.auth.login.AppConfigurationEntry class
 * javax.security.auth.login.AppConfigurationEntry}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.security.auth.login.AppConfigurationEntryTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.security.auth.login.AppConfigurationEntryClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.security.auth.login.AppConfigurationEntry
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AppConfigurationEntryTests<SUT extends javax.security.auth.login.AppConfigurationEntry>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for
     * {@linkplain javax.security.auth.login.AppConfigurationEntry.LoginModuleControlFlag class
     * javax.security.auth.login.AppConfigurationEntry$LoginModuleControlFlag}, containing all instance relevant test
     * methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface
     * containing the class relevant test methods is
     * {@link org.j8unit.repository.javax.security.auth.login.AppConfigurationEntryTests.LoginModuleControlFlagTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.security.auth.login.AppConfigurationEntryClassTests.
     *      LoginModuleControlFlagClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.security.auth.login.AppConfigurationEntry.LoginModuleControlFlag
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface LoginModuleControlFlagTests<SUT extends javax.security.auth.login.AppConfigurationEntry.LoginModuleControlFlag>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.security.auth.login.AppConfigurationEntry.LoginModuleControlFlag#toString()
         * public java.lang.String javax.security.auth.login.AppConfigurationEntry$LoginModuleControlFlag.toString()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.security.auth.login.AppConfigurationEntry.LoginModuleControlFlag#toString()
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        @Override
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
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.security.auth.login.AppConfigurationEntry#getControlFlag()
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
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.security.auth.login.AppConfigurationEntry#getLoginModuleName()
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
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.security.auth.login.AppConfigurationEntry#getOptions()
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
