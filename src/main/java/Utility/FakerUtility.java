package Utility;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

import java.util.Locale;
import java.util.Random;

public class FakerUtility {
	public static Faker faker = new Faker(new Random(24));
	public static FakeValuesService fakeValuesService = new FakeValuesService(
			new Locale("en-GB"), new RandomService());


}
