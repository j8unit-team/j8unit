package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExpressionClassTest
implements org.j8unit.repository.java.beans.ExpressionClassTests<java.beans.Expression> {

    @Override
    public Class<java.beans.Expression> createNewSUT() {
        return java.beans.Expression.class;
    }

}
