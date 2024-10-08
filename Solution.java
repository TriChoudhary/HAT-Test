public class Solution {


    public String rotate (String text , int number ){
        String result="";
        for(int i=number;i< text.length();i++){
            result=result+text.charAt(i);
        }
        
        for(int i=0;i<number;i++){
            result=result+text.charAt(i);
        }
        return result;
        }
    

    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.rotate("ramesh", 3));
    }
}
