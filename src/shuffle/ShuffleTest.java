package shuffle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName:ShuffleTest
 * @Description:
 * @Author: liuanhai
 * @Date 2020/8/27 0027
 * @Version 1.0
 */
public class ShuffleTest {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 49; i++)
            numbers.add(i);
        Collections.shuffle(numbers);
        List<Integer> winningCombination = numbers.subList(0, 6);
        Collections.sort(winningCombination);
        System.out.println(winningCombination);

    }
}
