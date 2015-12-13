package org.j8unit.repository;

import java.util.concurrent.Callable;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import javax.accessibility.AccessibleStateSet;
import javax.management.AttributeValueExp;
import javax.management.StringValueExp;
import javax.swing.DebugGraphics;
import javax.swing.text.html.HTML;
import javax.swing.text.html.parser.ContentModel;
import org.j8unit.repository.java.lang.annotation.AnnotationClassTests;
import org.j8unit.repository.javax.accessibility.AccessibleStateSetTests;
import org.j8unit.repository.javax.management.AttributeValueExpTests;
import org.j8unit.repository.javax.management.StringValueExpTests;
import org.j8unit.repository.javax.swing.DebugGraphicsTests;
import org.j8unit.repository.javax.swing.text.html.HTMLTests;
import org.j8unit.repository.javax.swing.text.html.parser.ContentModelTests;
import org.junit.Test;

public class KnownJavaBugs {

    public static @interface AnnotationWithLambdaField {

        public static final Supplier<String> FOO = () -> "foo";

        public static final UnaryOperator<String> BAR = s -> "bar";

        public static final Callable<String> FOOBAR = () -> "foobar";

        public String value() default "";

    }

    @Test(expected = AssertionError.class)
    public void javaCompilerCrashesVirtueOfAnnotationByMethodWithFormalParameters_AnnotationClassTests() {
        final AnnotationClassTests<AnnotationWithLambdaField> awlf = () -> AnnotationWithLambdaField.class;
        awlf.declaredMethodsCannotHaveFormalParameters();
    }

    @Test(expected = AssertionError.class)
    public void javaCompilerCrashesVirtueOfAnnotationByMethodWithThrowsClause_AnnotationClassTests() {
        final AnnotationClassTests<AnnotationWithLambdaField> awlf = () -> AnnotationWithLambdaField.class;
        awlf.declaredMethodsCannotHaveThrowsClause();
    }

    @Test(expected = AssertionError.class)
    public void toStringReturnsNull_AccessibleStateSet() {
        final AccessibleStateSetTests<AccessibleStateSet> ass = AccessibleStateSet::new;
        ass.toStringMustReturnNotNull();
    }

    @Test(expected = AssertionError.class)
    public void toStringReturnsNull_AttributeValueExp() {
        final AttributeValueExpTests<AttributeValueExp> ave = AttributeValueExp::new;
        ave.toStringMustReturnNotNull();
    }

    @Test(expected = AssertionError.class)
    public void toStringReturnsNull_HTML_Tag() {
        final HTMLTests.TagTests<HTML.Tag> t = HTML.Tag::new;
        t.toStringMustReturnNotNull();
    }

    @Test(expected = AssertionError.class)
    public void toStringReturnsNull2_AttributeValueExp() {
        final AttributeValueExpTests<AttributeValueExp> ave = () -> new AttributeValueExp(null);
        ave.toStringMustReturnNotNull();
    }

    @Test(expected = NullPointerException.class)
    public void toStringThrowsAnException_ContentModel() {
        final ContentModelTests<ContentModel> cm = ContentModel::new;
        cm.toStringMustReturnNotNull();
    }

    @Test(expected = NullPointerException.class)
    public void toStringThrowsAnException_DebugGraphics() {
        final DebugGraphicsTests<DebugGraphics> dg = DebugGraphics::new;
        dg.toStringMustReturnNotNull();
    }

    @Test(expected = NullPointerException.class)
    public void toStringThrowsAnException_StringValueExp() {
        final StringValueExpTests<StringValueExp> sve = StringValueExp::new;
        sve.toStringMustReturnNotNull();
    }

}
