package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NameValuePairHelperClassTest
implements org.j8unit.repository.org.omg.DynamicAny.NameValuePairHelperClassTests<org.omg.DynamicAny.NameValuePairHelper> {

    @Override
    public Class<org.omg.DynamicAny.NameValuePairHelper> createNewSUT() {
        return org.omg.DynamicAny.NameValuePairHelper.class;
    }

}
