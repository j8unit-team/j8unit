package org.j8unit.repository.javax.print.attribute;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IntegerSyntaxClassTest
implements org.j8unit.repository.javax.print.attribute.IntegerSyntaxClassTests<javax.print.attribute.IntegerSyntax> {

    @Override
    public Class<javax.print.attribute.IntegerSyntax> createNewSUT() {
        return javax.print.attribute.IntegerSyntax.class;
    }

}
