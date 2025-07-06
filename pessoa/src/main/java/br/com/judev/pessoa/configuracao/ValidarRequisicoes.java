package br.com.judev.pessoa.configuracao;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ValidarRequisicoes {

    // Método que lida com a exceção MethodArgumentNotValidException
    @ExceptionHandler(MethodArgumentNotValidException.class)  // Captura a exceção MethodArgumentNotValidException, que ocorre quando há erro de validação nos parâmetros
    @ResponseStatus(HttpStatus.BAD_REQUEST)  // Define que o status HTTP da resposta será 400 (Bad Request), pois a requisição está mal formada
    public ResponseEntity<Map<String, String>> handleValidationExceptions(MethodArgumentNotValidException ex) {

        // Criação de um mapa para armazenar os erros de validação
        Map<String, String> errors = new HashMap<>();

        // Itera sobre todos os erros de validação encontrados na exceção
        ex.getBindingResult().getAllErrors().forEach(error -> {

            // Obtém o nome do campo que causou o erro de validação
            String fieldName = ((FieldError) error).getField();

            // Obtém a mensagem de erro associada ao campo
            String errorMessage = error.getDefaultMessage();

            // Adiciona o campo e a mensagem de erro ao mapa de erros
            errors.put(fieldName, errorMessage);
        });

        // Retorna uma ResponseEntity com os erros e o status HTTP 400
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }
}
