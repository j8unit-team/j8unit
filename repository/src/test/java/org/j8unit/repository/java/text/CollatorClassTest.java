package org.j8unit.repository.java.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CollatorClassTest
implements org.j8unit.repository.java.text.CollatorClassTests<java.text.Collator> {

    @Override
    public Class<java.text.Collator> createNewSUT() {
        return java.text.Collator.class;
    }

}
