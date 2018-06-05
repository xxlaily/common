package cn.dm.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class PrintUtil {
	public HttpServletResponse response;
	public PrintUtil(HttpServletResponse response, String contentType){
		this.response=response;
		this.response.setContentType(contentType);
	}
	public PrintUtil(HttpServletResponse response){
		this.response=response;
	}
	public void print(Object msg){
        PrintWriter writer=null;
		try {
            if(null != response){
				//如果系统打开了outputStream 那么将其关闭
                writer=new PrintWriter(response.getOutputStream());
                writer.write(new String(String.valueOf(msg).getBytes(),"utf-8"));
                writer.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
				writer.close();
		}
    }
}
