public class PrefixCalculator{
	public static void main(String [] args){
		Stack <String> stack = new LLStack<String>();
		for(int i = 0; i < args.length; i++){ //Will run all the inputs
			String value = args[i]; //value set to next argument of command line arguments
			if(isOperator(value)){ //if value is an operator
				stack.push(value); //push value on the stack
			}
			else{ //we know value is a operand
				while(stack.empty() == false && isOperator(stack.peek()) == false){ //stack not empty AND top of stack is not an operator

				}
			}
		}
	}


//Check if value is either a operator or operand
	public static boolean isOperator(String S){
		if(S.equals("+") || S.equals("-") || S.equals("/") || S.equals("x"))
			return true;
		return false;
	}


}