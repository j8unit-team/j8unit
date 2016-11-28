package org.j8unit.repository.javax.naming;

import javax.naming.ReferralException;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ReferralException} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.naming.ReferralExceptionClassTests}).
 */
@RunWith(J8Unit4.class)
public class ReferralExceptionClassTest
implements ReferralExceptionClassTests<ReferralException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.ReferralException]

    @Override
    public Class<ReferralException> createNewSUT() {
        return ReferralException.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.ReferralException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.ReferralException]

}
