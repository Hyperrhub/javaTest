class NastedIf{

public static void main(String [] args){

int num1 = 9;
int num2 = 10;
int num3 = 11;

if (num1>num2){
  if (num1 >num3){
      System.out.println(num1 +"is the largest ");
	}
	
	else{
	System.out.println(num2+"is the largest");
	}
}
	else{
		if (num2>num3){
			System.out.println(num2+"is the largest");
	}
	else{
		System.out.println(num3+"is the largest");
	}
	}
}
}



