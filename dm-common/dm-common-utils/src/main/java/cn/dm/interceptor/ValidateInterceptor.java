package cn.dm.interceptor;
import cn.dm.common.*;
import cn.dm.exception.ErrorCode;
import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p></p>
 *
 * @author zzshang
 * @version v1.0
 * @since 2015/5/19
 */
public class ValidateInterceptor implements HandlerInterceptor {

    private static Logger logger = Logger.getLogger(ValidateInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }
    /**
     * 异常处理
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws java.io.IOException
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        response.setHeader("Content-type", "text/html;charset=UTF-8");
        PrintUtil print = new PrintUtil(response);
        Dto dto =null;
        logger.info(request.getRequestURI() + ">>>>>>");
        logger.info(request.getRequestURL() + ">>>>>>");
        //拦截异常信息
        if (EmptyUtils.isNotEmpty(ex)) {
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json; charset=utf-8");
            try {
                if (ex instanceof BaseException) {
                    BaseException se = (BaseException) ex;
                    dto= DtoUtil.returnFail(se.getErrorMessage(),se.getErrorCode());
                } else {
                    dto= DtoUtil.returnFail(ErrorCode.COMMON_Exception.getErrorMessage(),ErrorCode.COMMON_Exception.getErrorCode());
                }
                print.print(JSONObject.toJSONString(dto));
            } catch (Exception e) {
                if (!(ex instanceof BaseException)) {
                    e.printStackTrace();
                }
            }
        }
    }
}