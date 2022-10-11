package week_3_Homework_3.core.validation;

import java.util.List;

public class ValidationEntity {
	public boolean isValid;
	public List<String> message;

	public ValidationEntity(boolean isValid, List<String> message) {
		this.isValid = isValid;
		this.message = message;
	}
}
