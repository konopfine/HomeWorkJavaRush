import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        // Считать строки с консоли и объявить ArrayList list
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        
        ArrayList<String> result = doubleValues(list);

        // Вывести на экран result
        for (String a : result) {
            System.out.println(a);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list)
    {
        for (int i = 0; i < list.size(); i++) {
            list.add(i + 1, list.get(i)); // добавляем дубликат после оригинала
            i++; // увеличиваем индекс на 2, чтобы перейти к следующему оригиналу
        }
        return list;
    }
}
