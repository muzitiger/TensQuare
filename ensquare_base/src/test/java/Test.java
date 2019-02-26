/**
 * @program: tensquare_parent
 * @description: ${description}
 * @author: Ming.Li
 * @create: 2019-02-19 11:08
 **/
public class Test {
    public static int main(String[] args) {
        int[] array = {5, 8, 9, 6, 2, 5, 7, 8, 4, 1, 0};
        if (array.length == 0)
           return 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
                return array[i + 1];
        }
        return array[0];

    }
}
