import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task2_82
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] m = new int[4];
        for (int i = 0; i < m.length; i++)
        {
            m[i] = Integer.parseInt(r.readLine());
        }
        int min = m[0];
        for (int i = 0; i < m.length; i++)
        {
            if (min < m[i])
            {
                min = m[i];
            }
        }
        System.out.println(min);
    }
}