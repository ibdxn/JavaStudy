package ch06;

public class Exam6_3_4 {
	public static String dilema(boolean a, boolean b) {
		String result ="";
		
		
		
		if(a==true && b==false) {
			result="A����,B 10��";
		}else if(a!=true && b==true) { result="A10��, B ����";
			
	}
		else if(a&&b)
		{
			result ="A 5��,B5��";
		}
		else if (!a&&!b) {
			result = "A1��,B1��";
		}
	return result;
	}
	public static void main(String[] args) { System.out.println(dilema(false,false));
		
	}

}
