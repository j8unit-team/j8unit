package org.j8unit.repository.java.security.spec;

import java.security.spec.KeySpec;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeySpecClassTest
implements org.j8unit.repository.java.security.spec.KeySpecClassTests<KeySpec> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.spec.KeySpec]

    @Override
    public Class<KeySpec> createNewSUT() {
        return KeySpec.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.spec.KeySpec]

}
