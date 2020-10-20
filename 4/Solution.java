
public class Solution {

 /* Учитель рисования просит класс открыть книги по номеру страницы. 
 * Иван можете начать перелистывать страницы книги сначала или с конца. 
 * Всегда переворачивает страницы по одной. Когда открывает книгу, то 1 страница всегда находитс¤ справа.
 * ѕоследняя страница может быть напечатана на одной странице, 
 * зависет от количества страниц в книге. 
 * Сколько раз минимум нужно Ивану перевернуть сраницы, чтобы найти нужную.
 * Счистать можно как сначала, так и с конца.
	*
 * n - количество страниц в книге
 * p - номер нужной страницы
 * 1 <= n
 * 1 <= p
	*
 * ѕример: 6 2; 4 5; 
 * ќтвет: 1; 0.

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
>>>>>>> 793f098cb36890816e1b2af768161977572d0274
