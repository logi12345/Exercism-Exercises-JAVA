class ArmstrongNumbers {


	 boolean isArmstrongNumber(int numberToCheck) {
		int x = numberToCheck;
		int numLength = (int) Math.log10(numberToCheck)+1;
		int[] digits = new int[numLength];
		int j=numLength-1;
		while(x>0){
			digits[j] = x%10;
			x=x/10;
			j--;
		}
		int result = 0;
		for (int num:digits){
			result+=power(num,num,numLength);
		}
		return result==numberToCheck;
	}

	 int power(int value, int base, int exponent){
		if (value==base && exponent==0)
			return 1;
		else if (value!=base && exponent==0)
		{
			return value/base;
		}
		else
		{
			return power(value=value*base,base,exponent-1);
		}
	}
}
