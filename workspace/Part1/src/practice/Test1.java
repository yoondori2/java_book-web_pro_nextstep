package practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
	int add(String text) {
		if (isBlank(text)) {
			return 0;
		}

		return sum(isInt(split(text)));
	}

	private boolean isBlank(String text) {
		return text == null || text.isEmpty();
	}

	private String[] split(String text) {
		// Pattern: 정규 표현식이 컴파일 된 클래스이며 정규 표현식에 대상 문자열을 검증하거나, 활요하기 위해 사용하는 클래스이다.
		// Pattern.compile 주어진 정규식을 갖는 패턴을 생성
		// Pattern.compile.matcher() 패턴에 매칭할 문자열을 입력해 Matcher를 생성한다.
		// m = [pattern=//(.)(.*) region=0,9 lastmatch=//;1;2;3]
		// m.find 패턴과 일치하는게 있다면
		// m.group(1) ;
		// m.group(2) 1;2;3
		Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
		if (m.find()) {
			String customDelimeter = m.group(1);
			return m.group(2).split(customDelimeter);
		}
		return text.split(",|:");
	}

	private int[] isInt(String[] values) {
		int[] numbers = new int[values.length];
		for (int i = 0; i < values.length; i++) {
			numbers[i] = toPositive(values[i]);
		}
		return numbers;
	}

	private int toPositive(String value) {
		int number = Integer.parseInt(value);
		if (number < 0) {
			throw new RuntimeException();
		}
		return number;
	}

	private int sum(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
}
