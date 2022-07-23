class Solution {
public boolean isValid(String s) {

   StringBuilder x = new StringBuilder(s); 

    int i=0;
    while(i<x.length()-1){            
        if((x.charAt(i)=='(' && x.charAt(i+1)== ')') || (x.charAt(i)=='{' && x.charAt(i+1)== '}') || (x.charAt(i)=='[' && x.charAt(i+1)== ']') ){
            
            x= x.deleteCharAt(i);
            x=x.deleteCharAt(i);
            if(i!=0){
                i--;
            }
        }else{
            i++;
        }
    }
    if(x.length() == 0){
        return true;
    }else{
        return false;
    }
}
}