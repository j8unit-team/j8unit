package org.j8unit.repository.java.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NormalizerClassTest
implements org.j8unit.repository.java.text.NormalizerClassTests<java.text.Normalizer> {

    @Override
    public Class<java.text.Normalizer> createNewSUT() {
        return java.text.Normalizer.class;
    }

    @RunWith(J8Unit4.class)
    public static class FormClassTest
    implements org.j8unit.repository.java.text.NormalizerClassTests.FormClassTests<java.text.Normalizer.Form> {

        @Override
        public Class<java.text.Normalizer.Form> createNewSUT() {
            return java.text.Normalizer.Form.class;
        }

    }

}
