// the remainder has the same sign as the dividend

 print("Enter the dividend: ")
 String s = System.console().readLine()
 int dividend = Integer.parseInt(s)
 print("Enter the divisor: ")
 s = System.console().readLine()
 int divisor = Integer.parseInt(s)
 if(dividend==0 && divisor ==0) {
 	println("0 divided by 0 is indeterminate.")
 } else if(divisor==0) {
 	println("division by 0 is impossible.")
 } else {
 	int whole = Math.abs(divisor)
 	int absDividend = Math.abs(dividend)
 	int count = 0
 	int remainder = 0
 	if(whole>absDividend) {
 		whole = 0;
 		remainder = dividend
 	} else {
 		while(whole<absDividend) {
 			whole = whole + Math.abs(divisor)
 			count++
 		}
 		if(whole>absDividend) {
 			whole = whole - Math.abs(divisor)
 			count--
 		}
 		remainder = absDividend - whole
 		if((dividend<0 && divisor>0) || (dividend>0 && divisor<0)) {
 			whole = whole*(-1);
 		}
 		if(dividend<0) {
 			remainder = remainder*(-1)
 		}
 	}
 	println(dividend + " divided by " + divisor + " is " + whole + ", remainder " + remainder)
 }
 			
