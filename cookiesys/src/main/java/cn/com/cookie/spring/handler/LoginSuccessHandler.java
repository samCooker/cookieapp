package cn.com.cookie.spring.handler;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {


    private Boolean alwaysUseDefaultTargetUrl;

    private String defaultTargetUrl;


    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        // 日志
        super.setAlwaysUseDefaultTargetUrl(alwaysUseDefaultTargetUrl);
        super.setDefaultTargetUrl(defaultTargetUrl);
        super.onAuthenticationSuccess(request, response, authentication);
    }

    public void setAlwaysUseDefaultTargetUrl(Boolean alwaysUseDefaultTargetUrl) {
        this.alwaysUseDefaultTargetUrl = alwaysUseDefaultTargetUrl;
    }

    public void setDefaultTargetUrl(String defaultTargetUrl) {
        this.defaultTargetUrl = defaultTargetUrl;
    }

}
