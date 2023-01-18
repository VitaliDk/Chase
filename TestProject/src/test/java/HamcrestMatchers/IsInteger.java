package HamcrestMatchers;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class IsInteger extends TypeSafeMatcher<String> {

    @Override
    protected boolean matchesSafely(String s) {
        try {
        	Integer.parseInt(s);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public void describeTo(Description description) {
        description.appendText("is integer");
    }

    public static Matcher<String> isInteger() {
        return new IsInteger();
    }
}