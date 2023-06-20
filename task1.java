package java_projs.hwsem1;

public class task1 {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.trim();
        int n=s.length(), i=n-1, j=n;
        while(i>=0){
            if(s.charAt(i)==' '){
                sb.append(s.substring(i+1,j)).append(" ");
                while(s.charAt(i)==' ')
                    i--;
                j=i+1;
            }
            else
                i--;
        }
        sb.append(s.substring(0,j));
        return sb.toString();    
    }
}
