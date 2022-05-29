package srl.neotech.configuration;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import srl.neotech.mapper.DozerMapper;
import srl.neotech.model.ErrorMessage;
import srl.neotech.requestresponse.ResponseBase;

@ControllerAdvice
public class SpringExceptionHandler {



	@ResponseBody
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	ResponseBase Handler(MethodArgumentNotValidException e) {
		
	    ResponseBase resp=new ResponseBase();
	    resp.setCode("KOVALIDATION");
	    ArrayList<ErrorMessage> messages=new ArrayList<ErrorMessage>();
		for(ObjectError error:e.getAllErrors()) {
			ErrorMessage message=DozerMapper.getInstance().map(error,ErrorMessage.class);
			messages.add(message);
		}
	resp.setSimpleData(messages);
    return resp;
	}
	
}
