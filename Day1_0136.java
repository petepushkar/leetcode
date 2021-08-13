public class Day1_0136 {
    public int singleNumber(int[] nums) {
        int retval = 0;
        for(int current : nums) {
            retval ^= current; //XOR operation
        }
        return retval;
    }
}