package util;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;



public class Mail {
	// Email: quangnhat14122002@gmail.com
	// Password: mqkr eola ovkq rwxk
	static final String from = "quangnhat14122002@gmail.com";
	static final String password = "mqkr eola ovkq rwxk";
	
	public static boolean sendEmail(String to, String tieuDe, String noiDung ) {
		// Properties: Khai báo các thuộc tính
				Properties props = new Properties();
				props.put("mail.smtp.host", "smtp.gmail.com"); // smtp host
				props.put("mail.smtp.port", "587"); // tls 587 ssl 465
				props.put("mail.smtp.auth", "true"); // Phai dang nhap
				props.put("mail.smtp.starttls.enable", "true");
				
				// create authenticator 
				Authenticator auth = new Authenticator() {
					@Override
					protected PasswordAuthentication getPasswordAuthentication() {
						// TODO Auto-generated method stub
						return new PasswordAuthentication(from, password);
					}
					
				};
				
				// Phiên làm việc
				Session session = Session.getInstance(props, auth); 
				
				// Gửi email
				
				// Tạo nội dung muốn mở 
				MimeMessage msg = new MimeMessage(session);
				try {
					// Kiểu nội dụng
					msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
					// Người gửi
					msg.setFrom(from);
					
					// Người nhận
					msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to, false));
					// Tiêu đề Email
					msg.setSubject(tieuDe);
					// quy định ngày gửi 
					msg.setSentDate(new Date());
					// Quy địn email nhận phản hồi
					//msg.setReplyTo(InternetAddress.parse(from, false)); // => Nếu để mặc đinh sẽ gửi về email người gửi 
					 
					// Nội dung 
					msg.setContent(noiDung, "text/HTML; charset=UTF-8");
					Transport.send(msg);
					
					System.out.println("Gửi email thành công");
					return true;
				
				} catch (Exception e) {
					System.out.println("Gửi thất bại");
					e.printStackTrace();
					return false;
				}
	}
	
	public static void main(String[] args) {
		boolean kq =  Mail.sendEmail("quangnhat14122002@gmail.com", "Vũ trụ công nghệ", "Chúc mừng bạn đã đăng ký tài khoản thành công");
	}
}
