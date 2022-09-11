import com.mysql.cj.util.StringUtils;

public class accept_Password_Format_test {

	@SuppressWarnings("null")
	public static boolean main(String[] args) {
		 String specialChars = "~`!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
		    char currentCharacter;
		    boolean numberPresent = false;
		    boolean upperCasePresent = false;
		    boolean lowerCasePresent = false;
		    boolean specialCharacterPresent = false;

		    String input = null;
			for (int i = 0; i < input.length(); i++) {
		        currentCharacter = input.charAt(i);
		        if (Character.isDigit(currentCharacter)) {
		            numberPresent = true;
		        } else if (Character.isUpperCase(currentCharacter)) {
		            upperCasePresent = true;
		        } else if (Character.isLowerCase(currentCharacter)) {
		            lowerCasePresent = true;
		        } else if (specialChars.contains(String.valueOf(currentCharacter))) {
		            specialCharacterPresent = true;
		        }
		    }

		    return
		      numberPresent && upperCasePresent && lowerCasePresent && specialCharacterPresent;
		}
	}



