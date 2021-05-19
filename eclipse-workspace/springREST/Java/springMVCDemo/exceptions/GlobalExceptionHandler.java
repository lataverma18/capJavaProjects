package springMVCDemo.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice("springMVCDemo.controllers")
public class GlobalExceptionHandler {

@ExceptionHandler(IDNotFoundException.class)
public ResponseEntity<CustomErrorResponse> exceptionHandler(IDNotFoundException ex)
{
	CustomErrorResponse cer=new CustomErrorResponse("ID_NOT_FOUND_ERROR", ex.getMessage(), HttpStatus.NOT_FOUND.value());
	return new ResponseEntity<>(cer,HttpStatus.NOT_FOUND);
}
}
