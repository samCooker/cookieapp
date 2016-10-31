package cn.com.cookie.spring.handler;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginFailureHandler extends SimpleUrlAuthenticationFailureHandler {

    //登录失败默认跳转页面
    private String defaultFailureUrl;

    /**
     * (non-Javadoc)
     *
     * @see SimpleUrlAuthenticationFailureHandler#onAuthenticationFailure(HttpServletRequest,
     *      HttpServletResponse, AuthenticationException)
     */
    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
                    AuthenticationException exception) throws IOException, ServletException {
        // TODO: 登录失败后的处理
        super.setUseForward(true);
        super.setDefaultFailureUrl(defaultFailureUrl);
        super.onAuthenticationFailure(request, response, exception);
    }

    public void setDefaultFailureUrl(String defaultFailureUrl) {
        this.defaultFailureUrl = defaultFailureUrl;
    }


}
