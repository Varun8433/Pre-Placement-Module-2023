class Solution {
    public String reverseWords(String s) {
		String str= "";
		String parts[] = s.split(" ");
		
		for(String string: parts) {
			if(string == parts[parts.length-1]) {
				str+= reverse(string);
			}else
			str += reverse(string) + " ";
		}
		return str;
	}
	private  String reverse(String str){
	        String parts[] = str.split("");
	        for(int i = 0;i<parts.length/2;i++) {
	        	String temp = parts[parts.length-1-i];
	        	parts[parts.length-1-i] = parts[i];
	        	parts[i] = temp;
	        }
	        String str0 = "";
	        for(String string: parts) {
	        	str0 += string;
	        }
	       return str0;
	    }
        
}