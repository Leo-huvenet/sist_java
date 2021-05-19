package day0119;
/**
대입연산자<br>
=,
+=, -=, *=, /=, %=,
<<=, >>=, >>>=,
&=, |=, ^=
*/

class Operator7{
	public static void main(String[] args) {
		
	int i=3; //순수대입
	//산술대입
	i+=2; //i = i+2
	i-=1; //i = i-1
	i*=3; //i=i*3
	i/=5; //i=i/5 정수/정수=정수, 실수/실수=실수, 정수/실수=실수(자동형변환)

	i<<=4;// i = i<<4
	i>>=1;//i = i >>1
	i>>>=2;//i=i>>>2 (unsigned shift)

	i&=12; //i=i&12 
	i|=6; //i=i|6
	i^=9; //i=i^9


	i=1;
	i++; //i=i+1 , i+=1
	System.out.println(i);
	
  
	}
}
