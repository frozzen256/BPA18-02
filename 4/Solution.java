
public class Solution {

       /* ������� ��������� ������ ����� ������� ����� �� ������ ��������. 
	* ���� ������ ������ ������������� �������� ����� ������� ��� � �����. 
	* ������ �������������� �������� �� �����. ����� ��������� �����, �� 1 �������� ������ �������� ������.
	* ��������� �������� ����� ���� ���������� �� ����� ��������, 
	* ������� �� ���������� ������� � �����. 
	* ������� ��� ������� ����� ����� ����������� �������, ����� ����� ������.
	* �������� ����� ��� �������, ��� � � �����.
	*
	* n - ���������� ������� � �����
	* p - ����� ������ ��������
	* 1 <= n <= 10e5
	* 1 <= p <= n
	*
	* ������: 6 2;	4 5; 
	* �����:  1;	0.
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
>>>>>>> 793f098cb36890816e1b2af768161977572d0274
