package net.feelan.core.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.feelan.core.common.ProcResult;
import net.feelan.core.utils.ResponseUtils;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;



public class AccessDeniedHandlerImpl implements AccessDeniedHandler {

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response,
            AccessDeniedException accessDeniedException) throws IOException, ServletException {
        ProcResult result = new ProcResult();
        result.setStatusCode(300);
        result.setCallbackType("closeCurrent");
        result.setMessage("请添加以下权限:" + accessDeniedException.getMessage());
        ResponseUtils.write(response, result);
    }

}
