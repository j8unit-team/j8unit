package org.j8unit.repository.java.security;

import java.security.Key;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyClassTest
implements org.j8unit.repository.java.security.KeyClassTests<Key> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.Key]

    @Override
    public Class<Key> createNewSUT() {
        return Key.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.Key]

}
