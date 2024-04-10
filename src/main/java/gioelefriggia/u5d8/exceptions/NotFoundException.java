package gioelefriggia.u5d8.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(int id) {
        super(id + " not found!");
    }
}
