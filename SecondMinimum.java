class SecondMinimum{

    public int[] secMin(int[] nums){
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for(int n : nums){
            if(n < firstMin){
                secondMin = firstMin;
                firstMin = n;
            }
            else if(n < secondMin){
                secondMin = n;
            }
        }
        return new int[]{firstMin , secondMin};
    }

    public static void main(String[] args) {
    	SecondMinimum sm = new SecondMinimum();
        int num[] = {-1,-2,-3,-4,-5,12,3,4,5,6,7};
        int ans[] = sm.secMin(num);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
