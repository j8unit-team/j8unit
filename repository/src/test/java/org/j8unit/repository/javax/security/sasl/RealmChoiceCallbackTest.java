package org.j8unit.repository.javax.security.sasl;

import javax.security.sasl.RealmChoiceCallback;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RealmChoiceCallback} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.security.sasl.RealmChoiceCallbackTests}).
 */

@RunWith(J8Unit4.class)
public class RealmChoiceCallbackTest
implements RealmChoiceCallbackTests<RealmChoiceCallback> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.security.sasl.RealmChoiceCallback]

    @Override
    public RealmChoiceCallback createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.security.sasl.RealmChoiceCallback], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.security.sasl.RealmChoiceCallback]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.security.sasl.RealmChoiceCallback]

}
