package org.j8unit.repository.java.lang.invoke;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SerializedLambdaClassTest
implements org.j8unit.repository.java.lang.invoke.SerializedLambdaClassTests<java.lang.invoke.SerializedLambda> {

    @Override
    public Class<java.lang.invoke.SerializedLambda> createNewSUT() {
        return java.lang.invoke.SerializedLambda.class;
    }

}
