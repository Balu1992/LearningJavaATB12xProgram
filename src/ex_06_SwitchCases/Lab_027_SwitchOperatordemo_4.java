package ex_06_SwitchCases;

public class Lab_027_SwitchOperatordemo_4 {
    public static void main(String[] args) {
        //This example deals without break as it'll use "->". It supports only from JDK13.
        int ab=100;
        switch (ab){
            case 100 -> System.out.println("100");
            case 200 -> System.out.println("200");
        }
    }
}
