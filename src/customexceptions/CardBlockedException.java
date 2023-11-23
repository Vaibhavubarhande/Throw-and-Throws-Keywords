package customexceptions;

public class CardBlockedException extends RuntimeException {

	@Override
	public String getMessage() {

		return "Visit your nearest branch";
	}

}
