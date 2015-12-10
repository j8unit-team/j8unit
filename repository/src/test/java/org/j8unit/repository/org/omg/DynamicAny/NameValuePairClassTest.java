package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NameValuePairClassTest
implements org.j8unit.repository.org.omg.DynamicAny.NameValuePairClassTests<org.omg.DynamicAny.NameValuePair> {

    @Override
    public Class<org.omg.DynamicAny.NameValuePair> createNewSUT() {
        return org.omg.DynamicAny.NameValuePair.class;
    }

}
