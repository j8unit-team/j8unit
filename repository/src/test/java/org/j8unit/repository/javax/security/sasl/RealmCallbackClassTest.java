package org.j8unit.repository.javax.security.sasl;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RealmCallbackClassTest
implements org.j8unit.repository.javax.security.sasl.RealmCallbackClassTests<javax.security.sasl.RealmCallback> {

    @Override
    public Class<javax.security.sasl.RealmCallback> createNewSUT() {
        return javax.security.sasl.RealmCallback.class;
    }

}
