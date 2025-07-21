package ex_20_Enum;

public class Lab_094_URLs {
    public static void main(String[] args) {
        System.out.println(Url.google.getUrl());
    }
}
enum Url{
    google("https://www.google.com");

    private String Url;

    Url(String url){
        this.Url=url;
    }
    String getUrl(){
        return this.Url;
    }
}

