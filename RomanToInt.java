
// Online IDE - Code Editor, Compiler, Interpreter

public class RomanToInt
{
    public static int romanToInt(String s) {
        
        int val = 0,prev=0,sum=0;
        
        for(int i = 0; i<s.length(); i++)
        {
            switch(s.charAt(i)) {
                case 'I':
                    val = 1;
                    break;
                case 'V':
                    val = 5;
                    break;
                case 'X':
                    val = 10;
                    break;
                case 'L':
                    val = 50;
                    break;
                case 'C':
                    val = 100;
                    break;
                case 'D':
                    val = 500;
                    break;
                case 'M':
                    val = 1000;
                    break;
                        
                }
        if(val>prev) {
    		sum = sum - prev + val - prev;
    	}else {
    		sum = sum + val;
    	}
    	prev = val;
    }
        return sum;
        
    }
    public static void main(String[] args) {
        int x = romanToInt("MCMXCIV");
        System.out.println(x);
    }
}
