import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortandReverse {
    public static void main(String[] args) {
      int[] nums={3,1,2};
      String[] words={"Balu","Navya","Shaarvi"};

      class pair{
          int num;String word;
          pair(int n,String w)
          {
              num=n; word=w;
          }
      }
      List<pair> list=new ArrayList<>();
      for(int i=0;i< nums.length;i++)
          list.add(new pair(nums[i],words[i]));

      list.sort(Comparator.comparing(p->p.num));
      for(pair p:list)
          System.out.println(p.num+":"+new StringBuilder(p.word).reverse());
    }
}
