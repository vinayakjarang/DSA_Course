import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindtheDuplicateNumberARRAYS {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 5, 3,6};
        List<Integer> ar=new ArrayList<>();
//        ar.contains(;
        int sl = nums[0];
        int fst = nums[0];
        do {
            sl = nums[sl];
            fst = nums[nums[fst]];
        } while (sl != fst);
        fst = nums[0];
        while (fst != sl) {
            fst = nums[fst];
            sl = nums[sl];
        }
        System.out.println(sl);

    }
}

//        int [] n=nums.clone();
//        System.out.println(Arrays.toString(n));
//        Arrays.sort(nums);
//        int low=0;
//        int nxt=1;
//        while(nxt<=nums.length-1){
//            if(nums[low]==nums[nxt]){
//                System.out.println(nums[low]);
//            }
//            low++;
//            nxt++;
////        }
//    }
//}
