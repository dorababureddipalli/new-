package test;

//import java.util.FunctionalInterface;
@FunctionalInterface
interface Vignesh{
	String isPalindrome(int n);
	}
class Jaideep{
	String calculatePalindrome(int n){
	int actual=n,temp=0;
	while(n>0){
	int digitHolder=n%10;
	temp=temp*10+digitHolder;
	n=n/10;
	}
	return (actual==temp)?"palindrome":"not palindrome";
	}
	public static void main(String args[]){
	Jaideep j=new Jaideep();
	Vignesh v=j::calculatePalindrome;
	System.out.println(v.isPalindrome(101));
	}
}