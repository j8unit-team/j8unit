package org.j8unit.repository.javax.smartcardio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CardPermissionClassTest
implements org.j8unit.repository.javax.smartcardio.CardPermissionClassTests<javax.smartcardio.CardPermission> {

    @Override
    public Class<javax.smartcardio.CardPermission> createNewSUT() {
        return javax.smartcardio.CardPermission.class;
    }

}
