/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.Stack;

/**
 *
 * @author aidanranney
 */
public class CalcBrain implements Calculations {
    
    private final Stack<Float> results;
    
    private String operand;
    
    private Float total;
    
    public CalcBrain() {
        
        results = new Stack<>();
        operand = "";
        total = new Float(0);
    }
        
        //A Single digit from the UI.
    @Override
        public String digit(String digit){
            return digit;
        }
        
        /**
        * An arithmetic operator from the UI.
        * @param op
        * @return The result to display.
        */
    @Override
        public String operator(String op){
            Float first = results.pop();
            Float second = results.pop();
            
            switch(op) {
                case "+":
                    total = second + first;
                    break;
                case "-":
                    total = second - first;
                    break;
                case "/":
                    total = second / first;
                    break;
                case "*":
                    total = second * first;
                    break;
                case "^":
                    Double dTotal = Math.pow(second.doubleValue(), first.doubleValue());
                    total = dTotal.floatValue();
                   
                    
            operand = total.toString();
                   
            return operand;
        }
        
        /**
        * The ClearEntry button on the UI has been pressed
        * so remove any digits typed so far.
        * 
        * @return A calculated value to display. 
        */
        
        public String clearEntry(){
            String display = "\nCleared Digits\n";
            return display;
        }
        /**
        * The Clear button on the UI has been pressed
        * so all memory in the calculator is cleared.
        * 
        * @return A message to display. 
        */
        public String clear(){
            results.clear();
            }
            String display = "\nClear All\n";
            return display;

    @Override
    public String enterPressed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String addDecimal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        }
        
            
        /**
        * The Enter button on the UI has been pressed.
        * @return A message to display.
        */
        public String enterPressed(){
            results.push(digit);
        }
        /**
        * A decimal point on the UI has been pressed.
        * @return A message to display.
        */
        public String addDecimal(){

            return null;
        }
        /**
        * The operand sign on the UI is toggled to negative.
        * @return Treat the operand as a negative value.
        */       
    
    
    }
}
