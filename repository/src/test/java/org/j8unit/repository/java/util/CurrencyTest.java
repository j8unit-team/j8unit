package org.j8unit.repository.java.util;

import java.util.Currency;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CurrencyTest
implements org.j8unit.repository.java.util.CurrencyTests<Currency> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Currency]

    @Override
    public Currency createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.Currency], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Currency]

}
