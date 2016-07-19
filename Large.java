package Guvi;
import java.util.*;
public class Large {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three numbers");
int num1,num2,num3;
num1=s.nextInt();
num2=s.nextInt();
num3=s.nextInt();
int temp;
if(num1>num2)
{
	temp=num1;
}
else
{
	temp=num2;
}
if(temp<num3)
{
	System.out.println("The Largest Number is "+num3);
}
else
{
	System.out.println("The Largest Number is "+temp);
}
	}

}
