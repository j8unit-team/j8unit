package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CurrencyClassTest
implements org.j8unit.repository.java.util.CurrencyClassTests<java.util.Currency> {

    @Override
    public Class<java.util.Currency> createNewSUT() {
        return java.util.Currency.class;
    }

}
