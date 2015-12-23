package org.j8unit.repository.javax.xml.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeySelectorClassTest
implements org.j8unit.repository.javax.xml.crypto.KeySelectorClassTests<javax.xml.crypto.KeySelector> {

    @Override
    public Class<javax.xml.crypto.KeySelector> createNewSUT() {
        return javax.xml.crypto.KeySelector.class;
    }

    @RunWith(J8Unit4.class)
    public static class PurposeClassTest
    implements org.j8unit.repository.javax.xml.crypto.KeySelectorClassTests.PurposeClassTests<javax.xml.crypto.KeySelector.Purpose> {

        @Override
        public Class<javax.xml.crypto.KeySelector.Purpose> createNewSUT() {
            return javax.xml.crypto.KeySelector.Purpose.class;
        }

    }

}
