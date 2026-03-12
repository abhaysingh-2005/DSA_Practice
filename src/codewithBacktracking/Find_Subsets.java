package codewithBacktracking;

public class Find_Subsets {
    public static void findSubsets(String str, String ans, int i) {
        if (i == str.length()) {
            if(ans.length()==0){
                System.out.println("null");
            }else {
                System.out.print(ans + " ");
            }
            return;
        }
        //YES choice
        ans=ans+str.charAt(i);
        findSubsets(str, ans, i + 1);
        //NO choice
        ans=ans.substring(0,ans.length()-1);
        findSubsets(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str,"",0);
    }
}