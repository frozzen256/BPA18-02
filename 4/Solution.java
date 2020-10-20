import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

       /* ”читель рисовани€ просит класс открыть книги по номеру страницы. 
	* »ван можете начать перелистывать страницы книги сначала или с конца. 
	* ¬сегда переворачивает страницы по одной.  огда открывает книгу, то 1 страница всегда находитс§ справа.
	* Њоследн€€ страница может быть напечатана на одной странице, 
	* зависет от количества страниц в книге. 
	* —колько раз минимум нужно »вану перевернуть сраницы, чтобы найти нужную.
	* —чистать можно как сначала, так и с конца.
	*
	* n - количество страниц в книге
	* p - номер нужной страницы
	* 1 <= n <= 10e5
	* 1 <= p <= n
	*
	* Њример: 6 2;	4 5; 
	* Этвет:  1;	0.
      	*/

    static int pageCount(int n, int p) {
        /*
         * Write your code here.
         */

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

         bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}