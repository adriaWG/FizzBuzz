public class Reduce {
    public static void main(String[] args) {
        int number=100;
        int steps = getSteps(number);
        System.out.println(steps);
    }

    private static int getSteps(int number) {
        int steps=0;
        while(number !=0){
            if(number %2==0){
                number /=2;
            }
            else number -=1;
            steps++;
        }
        return steps;
    }
}
