package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UIDefaultsClassTest
implements org.j8unit.repository.javax.swing.UIDefaultsClassTests<javax.swing.UIDefaults> {

    @RunWith(J8Unit4.class)
    public static class ActiveValueClassTest
    implements org.j8unit.repository.javax.swing.UIDefaultsClassTests.ActiveValueClassTests<javax.swing.UIDefaults.ActiveValue> {

        @Override
        public Class<javax.swing.UIDefaults.ActiveValue> createNewSUT() {
            return javax.swing.UIDefaults.ActiveValue.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class LazyInputMapClassTest
    implements org.j8unit.repository.javax.swing.UIDefaultsClassTests.LazyInputMapClassTests<javax.swing.UIDefaults.LazyInputMap> {

        @Override
        public Class<javax.swing.UIDefaults.LazyInputMap> createNewSUT() {
            return javax.swing.UIDefaults.LazyInputMap.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class LazyValueClassTest
    implements org.j8unit.repository.javax.swing.UIDefaultsClassTests.LazyValueClassTests<javax.swing.UIDefaults.LazyValue> {

        @Override
        public Class<javax.swing.UIDefaults.LazyValue> createNewSUT() {
            return javax.swing.UIDefaults.LazyValue.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class ProxyLazyValueClassTest
    implements org.j8unit.repository.javax.swing.UIDefaultsClassTests.ProxyLazyValueClassTests<javax.swing.UIDefaults.ProxyLazyValue> {

        @Override
        public Class<javax.swing.UIDefaults.ProxyLazyValue> createNewSUT() {
            return javax.swing.UIDefaults.ProxyLazyValue.class;
        }

    }

    @Override
    public Class<javax.swing.UIDefaults> createNewSUT() {
        return javax.swing.UIDefaults.class;
    }

}
