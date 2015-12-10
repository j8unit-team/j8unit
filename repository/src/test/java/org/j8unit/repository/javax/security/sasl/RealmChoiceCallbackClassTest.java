package org.j8unit.repository.javax.security.sasl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RealmChoiceCallbackClassTest
implements org.j8unit.repository.javax.security.sasl.RealmChoiceCallbackClassTests<javax.security.sasl.RealmChoiceCallback> {

    @Override
    public Class<javax.security.sasl.RealmChoiceCallback> createNewSUT() {
        return javax.security.sasl.RealmChoiceCallback.class;
    }

}
