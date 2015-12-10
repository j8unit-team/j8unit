package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class DictionaryClassTest
implements org.j8unit.repository.java.util.DictionaryClassTests<java.util.Dictionary> {

    @Override
    public Class<java.util.Dictionary> createNewSUT() {
        return java.util.Dictionary.class;
    }

}
