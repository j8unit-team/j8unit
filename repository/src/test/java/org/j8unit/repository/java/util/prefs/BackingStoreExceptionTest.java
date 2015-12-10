package org.j8unit.repository.java.util.prefs;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BackingStoreExceptionTest
implements org.j8unit.repository.java.util.prefs.BackingStoreExceptionTests<java.util.prefs.BackingStoreException> {

    @Override
    public java.util.prefs.BackingStoreException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.util.prefs.BackingStoreException] available.");
    }

}
