package org.j8unit.repository.javax.swing.text.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FormSubmitEventClassTest
implements org.j8unit.repository.javax.swing.text.html.FormSubmitEventClassTests<javax.swing.text.html.FormSubmitEvent> {

    @RunWith(J8Unit4.class)
    public static class MethodTypeClassTest
    implements org.j8unit.repository.javax.swing.text.html.FormSubmitEventClassTests.MethodTypeClassTests<javax.swing.text.html.FormSubmitEvent.MethodType> {

        @Override
        public Class<javax.swing.text.html.FormSubmitEvent.MethodType> createNewSUT() {
            return javax.swing.text.html.FormSubmitEvent.MethodType.class;
        }

    }

    @Override
    public Class<javax.swing.text.html.FormSubmitEvent> createNewSUT() {
        return javax.swing.text.html.FormSubmitEvent.class;
    }

}
