package swagger.tests.exception.status;

import java.util.Map;

public class UnauthorizatedException extends HttpStatusException {

    public UnauthorizatedException() {
    }

    public UnauthorizatedException(final String message) {
        super(message);
    }

    public UnauthorizatedException(final Throwable cause) {
        super(cause);
    }

    public UnauthorizatedException(final Throwable cause, final String message) {
        super(message, cause);
    }

    public UnauthorizatedException(final String key, final String value) {
        super(key, value);
    }

    public UnauthorizatedException(final Map<String, String> additionalInformation) {
        super(additionalInformation);
    }

    public UnauthorizatedException(final Throwable cause, final String key, final String value) {
        super(cause, key, value);
    }

    public UnauthorizatedException(final Throwable cause, final Map<String, String> additionalInformation) {
        super(cause, additionalInformation);
    }

    @Override
    public int getStatusCode() {
        return 401;
    }
}
