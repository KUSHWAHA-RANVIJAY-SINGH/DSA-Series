//2956. Find Common Elements Between Two Arrays
public class Common_element {
    public static void main(String[] args) {
        int[]  nums1 = {4,3,2,3,1};
        int[] nums2 = {2,2,5,2,3,6};

        int count1 =0;
        int count2 =0;

        for (int i : nums1) {
            for(int j:nums2){
                if(i==j){
                    count1++;
                    break;
                }
            }
        }
        System.out.println(count1);

        for (int i : nums2) {
            for (int j : nums1) {
                if (i==j) {
                    count2++;
                    break;
                }
            }
        }
        System.out.println(count2);
    }
}
