package test;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import main.Account;


//TDD를 위한 테스트 예제 코드
public class AccountTest {

	@Test
	public void testAccount() throws Exception {
		Account account = new Account(10000);

	}

	@Test
	public void testGetBalance() throws Exception {
		Account account = new Account(10000);
		assertEquals(10000, account.getBalance());

	}

}
