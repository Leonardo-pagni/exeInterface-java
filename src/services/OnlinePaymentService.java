package services;

public interface OnlinePaymentService {

	double paymnetFee(double amount);
	double interest(double amount, int months);
}
