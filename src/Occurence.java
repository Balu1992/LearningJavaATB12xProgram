public class Occurence {
    public static void main(String[] args)
    {
        String str="Balu";
        int[] freq=new int[256];
        for(char c:str.toCharArray()) freq[c]++;
        for(int i=0;i<freq.length;i++)
            if(freq[i]>0) System.out.println((char)i +" :"+freq[i]);
    }
}
