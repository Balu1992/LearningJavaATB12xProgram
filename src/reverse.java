public class reverse {
    public static void main(String[] args)
    {
        String str="Welcome to JAVA balu";
        StringBuilder result=new StringBuilder();
        for(String word:str.split(" "))
            result.append(new StringBuilder(word).reverse()).append(" ");
        System.out.println(result.toString().trim());
    }
}
