package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UIDefaultsTest
implements org.j8unit.repository.javax.swing.UIDefaultsTests<javax.swing.UIDefaults> {

    @Override
    public javax.swing.UIDefaults createNewSUT() {
        return new javax.swing.UIDefaults();
    }

    @RunWith(J8Unit4.class)
    public static class ProxyLazyValueTest
    implements org.j8unit.repository.javax.swing.UIDefaultsTests.ProxyLazyValueTests<javax.swing.UIDefaults.ProxyLazyValue> {

        @Override
        public javax.swing.UIDefaults.ProxyLazyValue createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [javax.swing.UIDefaults.ProxyLazyValue] available.");
        }

    }

    @RunWith(J8Unit4.class)
    public static class LazyInputMapTest
    implements org.j8unit.repository.javax.swing.UIDefaultsTests.LazyInputMapTests<javax.swing.UIDefaults.LazyInputMap> {

        @Override
        public javax.swing.UIDefaults.LazyInputMap createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [javax.swing.UIDefaults.LazyInputMap] available.");
        }

    }

}
