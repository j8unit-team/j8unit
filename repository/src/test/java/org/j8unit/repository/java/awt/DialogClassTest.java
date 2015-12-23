package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DialogClassTest
implements org.j8unit.repository.java.awt.DialogClassTests<java.awt.Dialog> {

    @Override
    public Class<java.awt.Dialog> createNewSUT() {
        return java.awt.Dialog.class;
    }

    @RunWith(J8Unit4.class)
    public static class ModalityTypeClassTest
    implements org.j8unit.repository.java.awt.DialogClassTests.ModalityTypeClassTests<java.awt.Dialog.ModalityType> {

        @Override
        public Class<java.awt.Dialog.ModalityType> createNewSUT() {
            return java.awt.Dialog.ModalityType.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class ModalExclusionTypeClassTest
    implements org.j8unit.repository.java.awt.DialogClassTests.ModalExclusionTypeClassTests<java.awt.Dialog.ModalExclusionType> {

        @Override
        public Class<java.awt.Dialog.ModalExclusionType> createNewSUT() {
            return java.awt.Dialog.ModalExclusionType.class;
        }

    }

}
