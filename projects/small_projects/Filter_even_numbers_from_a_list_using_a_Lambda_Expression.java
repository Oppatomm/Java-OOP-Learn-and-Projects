import java.util.List;
public class Filter_even_numbers_from_a_list_using_a_Lambda_Expression {
    public static void main (String [] args) 
    {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        list.stream()
            .filter( n -> n % 2 == 0)
            .forEach( (n) ->  { System.out.println(n);});
    }
}