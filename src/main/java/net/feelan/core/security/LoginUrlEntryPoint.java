package net.feelan.core.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.feelan.core.common.ProcResult;
import net.feelan.core.utils.ResponseUtils;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;



@SuppressWarnings("deprecation")
public class LoginUrlEntryPoint extends LoginUrlAuthenticationEntryPoint {

    @Override
    public void afterPropertiesSet() throws Exception {
    }

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException)
            throws IOException, ServletException {
        String url = request.getRequestURI();
        final String contextPath = request.getContextPath();
        if (url.startsWith(contextPath + "/index")) {
            response.sendRedirect(contextPath + "/login.htm");
            return;
        }
        ProcResult result = new ProcResult();
        result.setMessage(authException.getMessage());
        result.setStatusCode(301);
        ResponseUtils.write(response, result);
    }

}
