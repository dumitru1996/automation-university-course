import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.isA;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.greaterThan;


public class JunitHamcrestExample {
    static final int A = 2;
    static final int B = 1;
    static final String NULL_STRING = null;
    static final String NOT_NULL_STRING = "Hello";

    @Test
    public void checkThatNull() {
        assertThat("Failed, first string is not null", NULL_STRING, is(nullValue()));
        assertThat("Failed, second string is not null", NOT_NULL_STRING, is(nullValue()));
    }

    @Test
    public void testStringContainsValue(){
        assertThat(NOT_NULL_STRING, containsString("Hell"));
    }

    @Test
    public void checkThatVariableEqualsToOurValue() {
        assertThat("failed with is()", A, is(A));
        assertThat("failed with equalsTo()", B, equalTo(B));
        assertThat("failed with is(equalsTo)", A, is(equalTo(A)));
        assertThat("failed with not()", A, not(B));
    }

    @Test
    public void testThatObjectIsAString() {
        assertThat(NULL_STRING, instanceOf(String.class));
        assertThat(NULL_STRING, isA(String.class)); //isA() - short form for instanceOf()
    }

    @Test
    void validateAListViaHamcrest() {
        List<Integer> list = Arrays.asList();

        assertThat(list, empty()); // ensure that list is empty

        list = Arrays.asList(10, 11, 12);

        assertThat(list, hasSize(3));
        assertThat(list, hasSize(3));
        assertThat(list, contains(10, 11, 12)); // ensure the order is correct
        assertThat(list, containsInAnyOrder(12, 10, 11));
        assertThat(list, everyItem(greaterThan(9)));

    }
}
