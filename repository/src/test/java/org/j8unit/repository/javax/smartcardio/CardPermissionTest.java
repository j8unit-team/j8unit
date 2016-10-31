package org.j8unit.repository.javax.smartcardio;

import javax.smartcardio.CardPermission;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CardPermissionTest
implements org.j8unit.repository.javax.smartcardio.CardPermissionTests<CardPermission> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.smartcardio.CardPermission]

    @Override
    public CardPermission createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.smartcardio.CardPermission], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.smartcardio.CardPermission]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.smartcardio.CardPermission]

}
