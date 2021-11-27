package edu.eam.ingesoft.appBiblioteca.model;

public class APIError {
    private String message;
    private int code;

    public APIError() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
