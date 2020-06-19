package xyz.apichiyu.project.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.apichiyu.project.util.bean.Result;

@ControllerAdvice
public class ApiExceptionController {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result customException(Exception e) {
        return Result.fail(e.getMessage());
    }
}
