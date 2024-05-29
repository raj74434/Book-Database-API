package com.books.manage.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExeptionHandler {

    @ExceptionHandler(BookException.class)
    public ResponseEntity<ExceptionBody> bookException(Exception exp, WebRequest req){

        ExceptionBody err= new ExceptionBody();
        err.setTime(LocalDateTime.now());
        err.setMessage(exp.getMessage());
        err.setDetails(req.getDescription(false));

        return new ResponseEntity<ExceptionBody>(err, HttpStatus.BAD_REQUEST);

    }

   
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleValidationExceptions(MethodArgumentNotValidException exception) {
        Map<String, String> errors = new HashMap<>();
        exception.getBindingResult().getFieldErrors().forEach(error -> errors.put(error.getField(), error.getDefaultMessage()));
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }

}
