package cn.com.cookie.spring.handler;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.SimpleUrlLogoutSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LogOutHandler extends SimpleUrlLogoutSuccessHandler {

    private Boolean alwaysUseDefaultTargetUrl;
    private String defaultTargetUrl;

    @Override
    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {

        if (authentication != null) {

        }

        super.setAlwaysUseDefaultTargetUrl(alwaysUseDefaultTargetUrl);
        super.setDefaultTargetUrl(defaultTargetUrl);
        super.onLogoutSuccess(request, response, authentication);
    }

    public void setAlwaysUseDefaultTargetUrl(Boolean alwaysUseDefaultTargetUrl) {
        this.alwaysUseDefaultTargetUrl = alwaysUseDefaultTargetUrl;
    }

    public void setDefaultTargetUrl(String defaultTargetUrl) {
        this.defaultTargetUrl = defaultTargetUrl;
    }

}
