package org.j8unit.repository.javax.naming.ldap;

import javax.naming.ldap.ManageReferralControl;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ManageReferralControl} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.naming.ldap.ManageReferralControlClassTests}).
 */

@RunWith(J8Unit4.class)
public class ManageReferralControlClassTest
implements ManageReferralControlClassTests<ManageReferralControl> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.ldap.ManageReferralControl]

    @Override
    public Class<ManageReferralControl> createNewSUT() {
        return ManageReferralControl.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.ldap.ManageReferralControl#ManageReferralControl() public
     * javax.naming.ldap.ManageReferralControl()}.
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
    public void create_ManageReferralControl()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ManageReferralControl sut = new ManageReferralControl();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.ldap.ManageReferralControl#ManageReferralControl(boolean) public
     * javax.naming.ldap.ManageReferralControl(boolean)}.
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
    public void create_ManageReferralControl_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ManageReferralControl sut = null; // = new ManageReferralControl(boolean);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.ldap.ManageReferralControl]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.ldap.ManageReferralControl]

}
