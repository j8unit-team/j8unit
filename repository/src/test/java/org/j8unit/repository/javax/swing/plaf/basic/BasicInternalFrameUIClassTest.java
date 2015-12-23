package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicInternalFrameUIClassTest
implements org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameUIClassTests<javax.swing.plaf.basic.BasicInternalFrameUI> {

    @Override
    public Class<javax.swing.plaf.basic.BasicInternalFrameUI> createNewSUT() {
        return javax.swing.plaf.basic.BasicInternalFrameUI.class;
    }

    @RunWith(J8Unit4.class)
    public static class InternalFrameLayoutClassTest
    implements
    org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameUIClassTests.InternalFrameLayoutClassTests<javax.swing.plaf.basic.BasicInternalFrameUI.InternalFrameLayout> {

        @Override
        public Class<javax.swing.plaf.basic.BasicInternalFrameUI.InternalFrameLayout> createNewSUT() {
            return javax.swing.plaf.basic.BasicInternalFrameUI.InternalFrameLayout.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class InternalFramePropertyChangeListenerClassTest
    implements
    org.j8unit.repository.javax.swing.plaf.basic.BasicInternalFrameUIClassTests.InternalFramePropertyChangeListenerClassTests<javax.swing.plaf.basic.BasicInternalFrameUI.InternalFramePropertyChangeListener> {

        @Override
        public Class<javax.swing.plaf.basic.BasicInternalFrameUI.InternalFramePropertyChangeListener> createNewSUT() {
            return javax.swing.plaf.basic.BasicInternalFrameUI.InternalFramePropertyChangeListener.class;
        }

    }

}
