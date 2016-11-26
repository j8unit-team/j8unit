package org.j8unit.repository.javax.security.sasl;

import javax.security.sasl.RealmCallback;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RealmCallback} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.security.sasl.RealmCallbackTests}).
 */
@RunWith(J8Unit4.class)
public class RealmCallbackTest
implements RealmCallbackTests<RealmCallback> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.sasl.RealmCallback]

    @Override
    public RealmCallback createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.security.sasl.RealmCallback], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.sasl.RealmCallback]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.sasl.RealmCallback]

}
