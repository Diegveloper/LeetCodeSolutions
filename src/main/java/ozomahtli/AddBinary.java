package ozomahtli;

public class AddBinary {
    //A naive approach to sum two binary numbers contained in 2 strings.
    public String addBinary(String a, String b) {
        int la = a.length();
        int lb = b.length();

        if(la > lb){
            String p = new String(new char[la -lb]).replace("\0","0");
            b = p + b;
        }
        if(lb > la){
            String p = new String(new char[lb - la]).replace("\0","0");
            a = p + a;
        }
        char[] ac = a.toCharArray();
        char[] bc = b.toCharArray();
        String output = "";
        char carry = '0';
        for(int i = ac.length -1; i >= 0; i--){
            char aa = ac[i];
            char bb = bc[i];
            if(aa == '1' & bb == '1'){
                if(carry == '0'){
                    output += '0';
                    carry = '1';
                }
                else{
                    output += '1';
                    carry = '1';
                }
            }
            if(aa == '0' & bb == '1'){
                if(carry == '0'){
                    output += '1';
                    carry = '0';
                }
                else{
                    output += '0';
                    carry = '1';
                }
            }
            if(aa == '1' & bb == '0'){
                if(carry == '0'){
                    output += '1';
                    carry = '0';
                }
                else{
                    output += '0';
                    carry = '1';
                }
            }
            if(aa == '0' & bb == '0'){
                if(carry == '0'){
                    output += '0';
                    carry = '0';
                }
                else{
                    output += '1';
                    carry = '0';
                }
            }
        }
        if(carry == '1'){
            output =  output + carry;
        }

        return new StringBuilder(output).reverse().toString();

    }
}
