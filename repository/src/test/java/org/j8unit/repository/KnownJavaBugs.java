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

    // /**
    // * {@code new AccessibleStateSet().toString()} returns {@code null} illegally.
    // */
    // @Override
    // @Test
    // @Category(JavaBug.class)
    // public void toStringMustReturnNotNull() {
    // org.j8unit.repository.javax.accessibility.AccessibleStateSetTests.super.toStringMustReturnNotNull();
    // }
    @Test(expected = AssertionError.class)
    public void toStringReturnsNull_AccessibleStateSet() {
        final AccessibleStateSetTests<AccessibleStateSet> ass = AccessibleStateSet::new;
        ass.toStringMustReturnNotNull();
    }

    // /**
    // * {@code new AttributeValueExp().toString()} returns {@code null} illegally.
    // *
    // * {@code new AttributeValueExp(null).toString()} returns {@code null} illegally.
    // */
    // @Override
    // @Test
    // @Category(JavaBug.class)
    // public void toStringMustReturnNotNull() {
    // org.j8unit.repository.javax.management.AttributeValueExpTests.super.toStringMustReturnNotNull();
    // }
    @Test(expected = AssertionError.class)
    public void toStringReturnsNull_AttributeValueExp() {
        final AttributeValueExpTests<AttributeValueExp> ave = AttributeValueExp::new;
        ave.toStringMustReturnNotNull();
    }

    @Test(expected = AssertionError.class)
    public void toStringReturnsNull_AttributeValueExp_String() {
        final AttributeValueExpTests<AttributeValueExp> ave = () -> new AttributeValueExp(null);
        ave.toStringMustReturnNotNull();
    }

    // /**
    // * {@code new HTML.Tag().toString()} returns {@code null} illegally.
    // */
    // @Override
    // @Test
    // @Category(JavaBug.class)
    // public void toStringMustReturnNotNull() {
    // org.j8unit.repository.javax.swing.text.html.HTMLTests.TagTests.super.toStringMustReturnNotNull();
    // }
    @Test(expected = AssertionError.class)
    public void toStringReturnsNull_HTML_Tag() {
        final HTMLTests.TagTests<HTML.Tag> t = HTML.Tag::new;
        t.toStringMustReturnNotNull();
    }

    // /**
    // * {@code new ContentModel().toString()} throws {@code NullPointerException} illegally.
    // */
    // @Override
    // @Test
    // @Category(JavaBug.class)
    // public void toStringMustReturnNotNull() {
    // org.j8unit.repository.javax.swing.text.html.parser.ContentModelTests.super.toStringMustReturnNotNull();
    // }
    @Test(expected = NullPointerException.class)
    public void toStringThrowsAnException_ContentModel() {
        final ContentModelTests<ContentModel> cm = ContentModel::new;
        cm.toStringMustReturnNotNull();
    }

    // /**
    // * {@code new DebugGraphics().toString()} throws {@code NullPointerException} illegally.
    // */
    // @Override
    // @Test
    // @Category(JavaBug.class)
    // public void toStringMustReturnNotNull() {
    // org.j8unit.repository.javax.swing.DebugGraphicsTests.super.toStringMustReturnNotNull();
    // }
    @Test(expected = NullPointerException.class)
    public void toStringThrowsAnException_DebugGraphics() {
        final DebugGraphicsTests<DebugGraphics> dg = DebugGraphics::new;
        dg.toStringMustReturnNotNull();
    }

    // /**
    // * {@code new StringValueExp().toString()} throws {@code NullPointerException} illegally.
    // */
    // @Override
    // @Test
    // @Category(JavaBug.class)
    // public void toStringMustReturnNotNull() {
    // org.j8unit.repository.javax.management.StringValueExpTests.super.toStringMustReturnNotNull();
    // }
    @Test(expected = NullPointerException.class)
    public void toStringThrowsAnException_StringValueExp() {
        final StringValueExpTests<StringValueExp> sve = StringValueExp::new;
        sve.toStringMustReturnNotNull();
    }

}
