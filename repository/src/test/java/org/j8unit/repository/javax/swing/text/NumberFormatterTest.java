package org.j8unit.repository.javax.swing.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NumberFormatterTest
implements org.j8unit.repository.javax.swing.text.NumberFormatterTests<javax.swing.text.NumberFormatter> {

    @Override
    public javax.swing.text.NumberFormatter createNewSUT() {
        return new javax.swing.text.NumberFormatter();
    }

}
