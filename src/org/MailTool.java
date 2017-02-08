package org;

import com.sun.mail.util.MailSSLSocketFactory;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.security.GeneralSecurityException;
import java.util.Properties;

/**
 * Created by cxd on 2016/11/22.
 */
public class MailTool {
    public static void test(int  i) throws MessagingException, GeneralSecurityException {
        Properties props = new Properties();

        // 开启debug调试
        props.setProperty("mail.debug", "true");
        // 发送服务器需要身份验证
        props.setProperty("mail.smtp.auth", "true");
        // 设置邮件服务器主机名
        props.setProperty("mail.host", "smtp.qq.com");
        // 发送邮件协议名称
        props.setProperty("mail.transport.protocol", "smtp");

        MailSSLSocketFactory sf = new MailSSLSocketFactory();
        sf.setTrustAllHosts(true);
        props.put("mail.smtp.ssl.enable", "true");
        props.put("mail.smtp.ssl.socketFactory", sf);

        Session session = Session.getInstance(props);
        Message msg = new MimeMessage(session);
        msg.setSubject("测试邮箱注册验证功能");
        StringBuilder builder = new StringBuilder();
        builder.append(i);
        msg.setText(builder.toString());
        msg.setFrom(new InternetAddress("928956576@qq.com"));
        Transport transport = session.getTransport();
        transport.connect("smtp.qq.com", "928956576@qq.com", "zcdamdazujqvbfbc");

        transport.sendMessage(msg, new Address[]{new InternetAddress("1141214484@qq.com")});
        transport.close();
        }

    public static void main(String[] args) {
        for (int i=0;i<=0;i++) {
            try {
                test(i);
            } catch (MessagingException e) {
                e.printStackTrace();
            } catch (GeneralSecurityException e) {
                e.printStackTrace();
            }
        }
    }
}
