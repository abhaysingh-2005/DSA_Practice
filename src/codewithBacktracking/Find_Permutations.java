package codewithBacktracking;

public class Find_Permutations {
    public static void find_permutation(String str, String gtr){
        if(str.length()==0){
            System.out.println(gtr);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String Newstr=str.substring(0,i)+str.substring(i+1);
            String Newgtr=gtr+ch;
            find_permutation(Newstr,Newgtr);

        }
    }
    public static void main(String[] args) {
        String str="abc";
        find_permutation(str," ");
    }
}
