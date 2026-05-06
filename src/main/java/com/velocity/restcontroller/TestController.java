package com.velocity.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	/*
	 * Returns a stylized HTML Payment Page directly from the controller
	 */
	@GetMapping("/getPayment")
	public String getPayment() {
		return "<html>" +
                "<head>" +
                "<style>" +
                "body { font-family: Arial, sans-serif; display: flex; justify-content: center; align-items: center; height: 100vh; background-color: #f4f4f9; }" +
                ".payment-card { background: white; padding: 40px; border-radius: 10px; box-shadow: 0 4px 8px rgba(0,0,0,0.1); width: 350px; text-align: center; }" +
                ".btn { background-color: #28a745; color: white; padding: 10px 20px; border: none; border-radius: 5px; cursor: pointer; font-size: 16px; margin-top: 20px; }" +
                "input { width: 100%; padding: 10px; margin: 10px 0; border: 1px solid #ddd; border-radius: 5px; box-sizing: border-box; }" +
                "</style>" +
                "</head>" +
                "<body>" +
                "<div class='payment-card'>" +
                "<h2>Secure Payment</h2>" +
                "<p>Amount to Pay: <b>$99.00</b></p>" +
                "<input type='text' placeholder='Card Number' maxlength='16'>" +
                "<div style='display:flex; gap:10px;'>" +
                "  <input type='text' placeholder='MM/YY' style='width:50%'>" +
                "  <input type='password' placeholder='CVV' style='width:50%'>" +
                "</div>" +
                "<button class='btn'>Pay Now</button>" +
                "<br><small style='color:gray;'>This is an executable jar demo</small>" +
                "</div>" +
                "</body>" +
                "</html>";
	}
}
