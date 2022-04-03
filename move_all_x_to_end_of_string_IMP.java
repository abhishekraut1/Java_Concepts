package com.company;
//Time Complexity = O(n+n) = O(2n) = O(n)
class move_all_x_to_end_of_string_IMP {
    public static void moveX(String str,int index,int count,String newString){
        if(index==str.length()){
            //concatenate 'x'
            for(int i=0;i<count;i++){
                newString+='x';
            }
            System.out.print(newString);
            return;
        }
        //checking 'x'
        if (str.charAt(index) == 'x') {
            count++;
            moveX(str,index+1,count,newString);
        }else{
            newString+=str.charAt(index);
            moveX(str,index+1,count,newString);
        }
    }
    public static void main(String[] args) {
        String str ="ajxoxpax";
        moveX(str,0,0,"");
    }
}
