
public class basic {
	
	public static void main(String[] args) {
		
		System.out.println(Calc("1+10-2"));
	}
	
	static String Calc(String exp) {
		String[] token=exp.split("((?<=[+-])|(?=[+-]))");
		float total=Integer.parseInt(token[0].trim());
		
		for(int i=1;i<token.length;i+=2) {
			switch(token[i]) {
			case "+":
				System.out.println(total+"="+total+"+"+Integer.parseInt(token[i+1]));
				   total+=Integer.parseInt(token[i+1]);
				break;
			case "-":
				System.out.println(total+"="+total+"-"+Integer.parseInt(token[i+1]));
				   total-=Integer.parseInt(token[i+1]);				
				break;
				
				default:
					System.out.println("not defined operator");
				break;
			}
		}
		
		return String.valueOf(total);
		
	}

}
