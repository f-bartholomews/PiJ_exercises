
System.out.print("Please enter a number: ");
String s = System.console().readLine();
int firstDividend = Integer.parseInt(s);
int dividend = firstDividend;
int divisor = 2;
boolean prime = true;
int largestPositivePrime = 0;
int largestNegativePrime = 0;
int positiveCount = 0;
int negativeCount = 0;

while(true) {
	while (dividend>divisor) {
		if (dividend%divisor == 0) {
			prime = false;
			break;
		} else {
			divisor++;
		}
	}
	if (prime == false) {
		positiveCount++;
		dividend++;
		divisor = 2;
		prime = true;
	} else {
		largestPositivePrime = dividend;
		break;
	}
}

dividend = firstDividend;
divisor = 2;
prime = true;

while(true) {
	while (dividend>divisor) {
		if (dividend%divisor == 0) {
			prime = false; 
			break;
		} else {
			divisor++;
		}
	}
	if (prime == false) {
		negativeCount++;
		dividend--;
		divisor = 2;
		prime = true;
	} else {
		largestNegativePrime = dividend;
		break;
	}
}

if (firstDividend <= 1) {
	System.out.println("The closest prime is 2, " + (2-firstDividend) + " digits away.");
} else if (positiveCount == 0) {
	System.out.println("The number is a prime.");
} else if (positiveCount > negativeCount) {
	System.out.println("The closest prime is " + largestNegativePrime + ", " + negativeCount + " digits away.");
} else if (positiveCount < negativeCount) {
	System.out.println("The closest prime is " + largestPositivePrime + ", " + positiveCount + " digits away.");
} else if (positiveCount == negativeCount) {
	System.out.print("The closest primes are " + largestNegativePrime + " and " + largestPositivePrime);
	System.out.println(", " + positiveCount + " digits away.");
}
