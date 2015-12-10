package org.j8unit.repository.javax.jws.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SOAPBindingClassTest
implements org.j8unit.repository.javax.jws.soap.SOAPBindingClassTests<javax.jws.soap.SOAPBinding> {

    @RunWith(J8Unit4.class)
    public static class ParameterStyleClassTest
    implements org.j8unit.repository.javax.jws.soap.SOAPBindingClassTests.ParameterStyleClassTests<javax.jws.soap.SOAPBinding.ParameterStyle> {

        @Override
        public Class<javax.jws.soap.SOAPBinding.ParameterStyle> createNewSUT() {
            return javax.jws.soap.SOAPBinding.ParameterStyle.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class StyleClassTest
    implements org.j8unit.repository.javax.jws.soap.SOAPBindingClassTests.StyleClassTests<javax.jws.soap.SOAPBinding.Style> {

        @Override
        public Class<javax.jws.soap.SOAPBinding.Style> createNewSUT() {
            return javax.jws.soap.SOAPBinding.Style.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class UseClassTest
    implements org.j8unit.repository.javax.jws.soap.SOAPBindingClassTests.UseClassTests<javax.jws.soap.SOAPBinding.Use> {

        @Override
        public Class<javax.jws.soap.SOAPBinding.Use> createNewSUT() {
            return javax.jws.soap.SOAPBinding.Use.class;
        }

    }

    @Override
    public Class<javax.jws.soap.SOAPBinding> createNewSUT() {
        return javax.jws.soap.SOAPBinding.class;
    }

}
