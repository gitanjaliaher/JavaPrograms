package java8features;

import java.util.Optional;

//   Created by Gitanjali Aher...
public class OptionalDemo {

	public static void main(String[] args) {
		String arr[] = new String[5];
		arr[3] = "Welcome to Edubridge.";
		
		Optional<String> result = Optional.ofNullable(arr[3]);
		
		if(result.isPresent()) {
			String upperCase = arr[3].toUpperCase();
			System.out.println(upperCase);
		}
		else {
			System.out.println("String is not present at 3rd position.");
		}

	}

}
