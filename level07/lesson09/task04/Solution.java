import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лира"); //1
        list.add("лоза"); //2
        list = fix(list);

        for (String s : list)
        {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list)
    {
        // Удаление слов, содержащих букву "р" и не содержащих "л"
        Iterator<String> iter = list.iterator();
        while (iter.hasNext())
        {
            String s = iter.next();
            if (s.contains("р") && !s.contains("л"))
            {
                iter.remove(); // Удаляем слово, если оно содержит "р" и не содержит "л"
            }
        }

        // Удвоение слов, содержащих "л" и не содержащих "р"
        for (int i = 0; i < list.size(); )
        {
            if ((list.get(i).contains("л")) && !(list.get(i).contains("р")))
            {
                list.add(i, list.get(i)); // Добавляем дубликат слова перед оригиналом
                i = i + 2; // Переходим на следующий элемент после дублированного
            }
            else i++;
        }
        return list;
    }
}
