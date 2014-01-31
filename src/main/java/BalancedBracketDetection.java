import java.util.Stack;

public class BalancedBracketDetection {
      public boolean checkBracketBalance(String bracketSequence){
          if(bracketSequence == null)
              return false;

          Stack<Character> bracketStack = new Stack<Character>();
          char[] bracketSequenceArray = bracketSequence.toCharArray();
          for(char element : bracketSequenceArray){
              if(bracketStack.isEmpty())
                  bracketStack.push(element);
              else{
                  char temp = bracketStack.peek();
                  if(temp == "{".charAt(0) && element == "}".charAt(0))
                      bracketStack.pop();
                  else if(temp == "(".charAt(0) && element == ")".charAt(0))
                      bracketStack.pop();
                  else if(temp == "[".charAt(0) && element == "]".charAt(0))
                      bracketStack.pop();
                  else
                      bracketStack.push(element);
              }
          }
          if(bracketStack.isEmpty())
              return true;
          else
              return false;

      }


    public static void main(String[] args) {
        BalancedBracketDetection balancedBracketDetection = new BalancedBracketDetection();
        Boolean balanceFlag;

        String firstBracketSequence = "()[]{}(([])){[()][]}";
        balanceFlag = balancedBracketDetection.checkBracketBalance(firstBracketSequence);
        System.out.println("Sequence " + firstBracketSequence +" is " + balanceFlag.toString());

        String secondBracketSequence = "())[]{}";
        balanceFlag = balancedBracketDetection.checkBracketBalance(secondBracketSequence);
        System.out.println("Sequence " + secondBracketSequence +" is " + balanceFlag.toString());

        String thirdBracketSequence = "[(])";
        balanceFlag = balancedBracketDetection.checkBracketBalance(thirdBracketSequence);
        System.out.println("Sequence " + thirdBracketSequence +" is " + balanceFlag.toString());

    }
}

