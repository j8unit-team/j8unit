package org.j8unit.tools;

import static java.util.Arrays.stream;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Optional;

public enum AccessLevel {

    PUBLIC {

        @Override
        protected boolean matches(final int modifier) {
            return Modifier.isPublic(modifier);
        }

    },

    PROTECTED {

        @Override
        protected boolean matches(final int modifier) {
            return Modifier.isProtected(modifier);
        }

    },

    PRIVATE {

        @Override
        protected boolean matches(final int modifier) {
            return Modifier.isPrivate(modifier);
        }

    },

    PACKAGE_PRIVATE {

        @Override
        protected boolean matches(final int modifier) {
            return !PUBLIC.matches(modifier) && !PROTECTED.matches(modifier) && !AccessLevel.PRIVATE.matches(modifier);
        }

    };

    public final boolean matches(final Class<?> clazz) {
        return this.matches(clazz.getModifiers());
    }

    public final boolean mismatches(final Class<?> clazz) {
        return !this.matches(clazz);
    }

    public final boolean matches(final Member member) {
        return this.matches(member.getModifiers());
    }

    public final boolean mismatches(final Member member) {
        return !this.matches(member);
    }

    protected abstract boolean matches(int modifier);

    public static final AccessLevel accessModifierOf(final Class<?> clazz) {
        final Optional<AccessLevel> level = stream(AccessLevel.values()).filter(al -> al.matches(clazz)).findFirst();
        assert level.isPresent() : "A class cannot have an access modifier different to public, package-private, protected, or private!";
        return level.get();
    }

    public static final AccessLevel accessModifierOf(final Member member) {
        final Optional<AccessLevel> level = stream(AccessLevel.values()).filter(al -> al.matches(member)).findFirst();
        assert level.isPresent() : "A member (constructor, method, field) cannot have an access modifier different to public, package-private, protected, or private!";
        return level.get();
    }

}
