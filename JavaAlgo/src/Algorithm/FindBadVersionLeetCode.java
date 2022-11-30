public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int middle = 0;
        while (start <= end) {
         
            middle = start +(end - start)/2;
            if (isBadVersion(middle)== true && isBadVersion(middle-1) ==false) {
                return middle;
            }
            else if (isBadVersion(middle) == false) {
                start = middle + 1;
            }
            else {
                end = middle - 1;
            }
            
        }
        return -1;
    }
}
