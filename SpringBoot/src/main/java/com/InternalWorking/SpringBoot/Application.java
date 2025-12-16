package com.InternalWorking.SpringBoot;

import com.InternalWorking.SpringBoot.service.PaymentService;
import com.InternalWorking.SpringBoot.service.RazorPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	/**
	 * The below code is a tight coupling for the RazorPayService binding
	 */
//	private RazorPayService razorPayService = new RazorPayService();

	/**
	 * //This @Autowired is used for the Dependency injection by using the filed injection technique
	 * through the Dependency injection  framework
	 */
//	@Autowired
	private PaymentService paymentService;

	/**
	 * Dependency inject through the CONSTRUCTOR INJECTION through the Dependency injection  framework
	 * @param paymentService service for the RazorPay payment
	 * NOTE -  Through CONSTRUCTOR INJECTION we can make the field final using FINAL keyword
	 */
	public Application(PaymentService paymentService) {
		this.paymentService = paymentService;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Calling Payment Service");
		String state =paymentService.pay();

	}
}
