public class PrefixCalculator{
	public static void main(String [] args){
		Stack <String> stack = new LLStack<String>();
		try{
			for(int i = 0; i < args.length; i++){ //Will run all the inputs
				
				String value = args[i]; //value set to next argument of command line arguments
				String poppedvalue;
				String operator;

				if(isOperator(value)){ //if value is an operator
					stack.push(value); //push value on the stack
				}
				else{ //we know value is a operand
					while(stack.empty() == false && isOperator(stack.peek()) == false){ //stack not empty AND top of stack is not an operator
						//System.out.println("entrou aqui");
						poppedvalue = stack.pop();
						//System.out.println("Popped:" +poppedvalue);
						operator = stack.pop();
						//System.out.println("Popped:" +operator);
						if(isOperator(operator) == false) //if last popped is not an operator
							throw new NumberFormatException("invalid expression");
						value = doCalculus(poppedvalue, operator, value);
					}
					stack.push(value);
				}	
			}
			if(stack.size() == 1){
				System.out.println("Result: "+stack.pop());
			}
			else{
				throw new NumberFormatException("invalid expression");
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}


	//Check if value is either a operator or operand
	public static boolean isOperator(String S){
		//System.out.println("Current testing" +S);
		if(S.equals("+") || S.equals("-") || S.equals("/") || S.equals("x"))
			return true;
		return false;
	}

	//Convert the item to be calculated
	public static String doCalculus(String a, String operator, String b){
		int result = 0;
		int aInt = Integer.parseInt(a);
		int bInt = Integer.parseInt(b);

		switch(operator){
			case "+":	result = aInt + bInt;
			break;
			case "-":	result = aInt - bInt;
			break;
			case "/":	result = aInt / bInt;
			break;
			case "x":	result = aInt * bInt;
			break;
		}
		System.out.println("RESULT" +result);
		String resultString = Integer.toString(result);
		return resultString;
	}
}