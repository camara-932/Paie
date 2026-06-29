package com.example.Paie.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmployerException extends RuntimeException{
    public EmployerException(Long id){
        super("Employe non trouvable avec l'id" + id);
    }
}
