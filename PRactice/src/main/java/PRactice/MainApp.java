package PRactice;

import java.util.function.IntPredicate;
import java.util.regex.Pattern;

@FunctionalInterface
interface UserValidator {
	boolean validate(int s);
}

public class MainApp {

	IntPredicate isOdd = n -> n % 2 == 1;
	IntPredicate isEven = n -> n % 2 == 0;
}

/*
 * private static final int PATTERN = n -> n % 2 == 0); UserValidator
 * validateeEvennumber = (s) -> (Pattern.compile().matcher(s).matches()); }
 */