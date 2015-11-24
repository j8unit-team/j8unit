package org.j8unit.tools;

import static java.util.Arrays.stream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Optional;

public enum Membership {

    CLASS {

        @Override
        public boolean matches(final Member member) {
            return Modifier.isStatic(member.getModifiers());
        }

        @Override
        public boolean matches(final Constructor<?> constructor) {
            return true;
        }

    },

    INSTANCE {

        @Override
        public boolean matches(final Member member) {
            return !Modifier.isStatic(member.getModifiers());
        }

        @Override
        public boolean matches(final Constructor<?> constructor) {
            return false;
        }

    };

    public abstract boolean matches(final Member member);

    public final boolean mismatches(final Member member) {
        return !this.matches(member);
    }

    public abstract boolean matches(final Constructor<?> constructor);

    public final boolean mismatches(final Constructor<?> constructor) {
        return !this.matches(constructor);
    }

    public static final Membership membershipOf(final Member member) {
        final Optional<Membership> membership = stream(Membership.values()).filter(k -> k.matches(member)).findFirst();
        assert membership.isPresent();
        return membership.get();
    }

}
