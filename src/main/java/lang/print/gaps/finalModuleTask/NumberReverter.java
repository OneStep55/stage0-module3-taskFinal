package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int revertedNum = 0;
        revertedNum += (number % 10) * 100 + ((number /= 10)% 10) * 10 + (number /= 10) ;

        System.out.println(revertedNum);
    }


}
