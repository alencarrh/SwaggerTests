package swagger.tests.exception.status;

public class InternalServerErrorException extends HttpStatusException {

    public InternalServerErrorException() {
    }

    public InternalServerErrorException(final String message) {
        super(message);
    }

    public InternalServerErrorException(final Throwable cause) {
        super(cause);
    }

    public InternalServerErrorException(final Throwable cause, final String message) {
        super(message, cause);
    }

    public InternalServerErrorException(final String key, final String value) {
        super(key, value);
    }

    public InternalServerErrorException(final Throwable cause, final String key, final String value) {
        super(cause, key, value);
    }

    @Override
    public int getStatusCode() {
        return 500;
    }
}
